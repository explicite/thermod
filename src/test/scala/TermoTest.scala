import java.util
import org.scalatest.FunSuite
import edu.termo._

/**
 * @author Jan 
 *         Date: 12/9/13
 */
class TermoTest extends FunSuite {
  test("Oxygen requirement test") {
    var elements: util.HashMap[String, java.lang.Double] = new util.HashMap[String, java.lang.Double]()
    elements.put("Hydrogen", 0.0)
    elements.put("CH4", 1.0)
    elements.put("C2H2", 0.0)
    elements.put("C2H4", 0.0)
    elements.put("C2H6", 0.0)
    elements.put("CO", 0.0)
    elements.put("CO2", 0.0)
    elements.put("Oxygen", 0.0)
    elements.put("Nitrogen", 0.0)
    elements.put("Water", 0.0)

    val lambda: Double = 1.0
    val x: Double = 0.0
    val combustion = new GasFuelCombustion(elements, lambda, x)

    assert(combustion.getTheoreticalOxygen == 2.0)
  }
}
