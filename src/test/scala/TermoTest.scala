import java.util
import org.scalatest.FunSuite
import edu.termo._
import edu.termo.KeyNames._
import termo.components.Molecule

/**
 * @author Jan 
 *         Date: 12/9/13
 */
class TermoTest extends FunSuite {
  test("Exercise 3.6.1") {
    var elements: util.HashMap[String, java.lang.Double] = new util.HashMap[String, java.lang.Double]()
    elements.put(HYDROGEN, 0.04)
    elements.put(CH4, 0.0)
    elements.put(C2H2, 0.0)
    elements.put(C2H4, 0.0)
    elements.put(C2H6, 0.0)
    elements.put(CO, 0.28)
    elements.put(CO2, 0.08)
    elements.put(OXYGEN, 0.0)
    elements.put(NITROGEN, 0.6)
    elements.put(WATER, 0.0)

    val lambda: Double = 1.0
    val x: Double = 0.0
    val combustion = new GasFuelCombustion(elements, lambda, x)

    val fumes = combustion.getFumesVolumes
    val V0s = fumes.get(CO2) + fumes.get(WATER) + fumes.get(NITROGEN)
    val Qi = combustion.getHeatOfCombustion
    val i0 = Qi / V0s
    val fumesMolecule = Molecule(List(
      (fumes.get(CO2) / fumes.get(WET_FUMES), termo.components.gas.CO2),
      (fumes.get(WATER) / fumes.get(WET_FUMES), termo.components.gas.H2O),
      (fumes.get(NITROGEN) / fumes.get(WET_FUMES), termo.components.gas.N2)
    ))

    def opt(t: Double): Double = if (fumesMolecule.enthalpy(t) >= i0) t else opt(t + 0.1)

    assert(opt(1500) == 1912.199999999625)
  }
}
