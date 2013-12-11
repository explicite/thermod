package termo

import edu.termo.{SolidFuelCombustion, GasFuelCombustion}
import termo.components._
import java.util
import edu.termo.KeyNames._
import termo.components.{Enthalpy, Molecule}


/**
 * @author Jan Paw 
 *         Date: 12/10/13
 */
object Main {
  def main(args: Array[String]) {
    var elements: util.HashMap[String, java.lang.Double] = new util.HashMap[String, java.lang.Double]()
    println("Calculation of the calorimeter flame temperature.\n1 - for solid fuel\n2 - for gas fuel")
    readLine() match {
      case "1" => {
        print("Carbon: ")
        elements.put(CARBON, readDouble() / 100.0)
        print("Hydrogen: ")
        elements.put(HYDROGEN, readDouble() / 100.0)
        print("Sulfur: ")
        elements.put(SULFUR, readDouble() / 100.0)
        print("Oxygen: ")
        elements.put(OXYGEN, readDouble() / 100.0)
        print("Nitrogen: ")
        elements.put(NITROGEN, readDouble() / 100.0)
        print("Ash: ")
        elements.put(ASH, readDouble() / 100.0)
        print("Water: ")
        elements.put(WATER, readDouble() / 100.0)
        print("Lambda: ")
        val lambda = readDouble()
        print("Humidity: ")
        val x = readDouble()

        val combustion = new SolidFuelCombustion(elements, lambda, x)

        val fumes = combustion.getFumesVolumes
        var V0s: Double = 0.0
        var moleculeList = List[(Double, Component with Enthalpy)]()

        if (fumes.containsKey(CO)) {
          V0s += fumes.get(CO)
          moleculeList ::=(fumes.get(CO) / fumes.get(WET_FUMES), termo.components.gas.CO)
        }

        if (fumes.containsKey(CO2)) {
          V0s += fumes.get(CO2)
          moleculeList ::=(fumes.get(CO2) / fumes.get(WET_FUMES), termo.components.gas.CO2)
        }

        if (fumes.containsKey(HYDROGEN)) {
          V0s += fumes.get(HYDROGEN)
          moleculeList ::=(fumes.get(HYDROGEN) / fumes.get(WET_FUMES), termo.components.gas.H2)
        }

        if (fumes.containsKey(WATER)) {
          V0s += fumes.get(WATER)
          moleculeList ::=(fumes.get(WATER) / fumes.get(WET_FUMES), termo.components.gas.H2O)
        }

        if (fumes.containsKey(NITROGEN)) {
          V0s += fumes.get(NITROGEN)
          moleculeList ::=(fumes.get(NITROGEN) / fumes.get(WET_FUMES), termo.components.gas.N2)
        }

        if (fumes.containsKey(OXYGEN)) {
          V0s += fumes.get(OXYGEN)
          moleculeList ::=(fumes.get(OXYGEN) / fumes.get(WET_FUMES), termo.components.gas.O2)
        }
        val Qi = combustion.getHeatOfCombustion
        val i0 = Qi / V0s

        val molecule = Molecule(moleculeList)

        def opt(t: Double): Double = if (molecule.enthalpy(t) >= i0) t else opt(t + 0.1)
        println("calorimeter flame temperature: " + opt(1) + "°C")
      }
      case "2" => {
        print("Hydrogen: ")
        elements.put(HYDROGEN, readDouble() / 100.0)
        print("CH4: ")
        elements.put(CH4, readDouble() / 100.0)
        print("C2H2: ")
        elements.put(C2H2, readDouble() / 100.0)
        print("C2H4: ")
        elements.put(C2H4, readDouble() / 100.0)
        print("C2H6: ")
        elements.put(C2H6, readDouble() / 100.0)
        print("CO: ")
        elements.put(CO, readDouble() / 100.0)
        print("CO2: ")
        elements.put(CO2, readDouble() / 100.0)
        print("Oxygen: ")
        elements.put(OXYGEN, readDouble() / 100.0)
        print("Nitrogen: ")
        elements.put(NITROGEN, readDouble() / 100.0)
        print("Water: ")
        elements.put(WATER, readDouble() / 100.0)
        print("Lambda: ")
        val lambda = readDouble()
        print("Humidity: ")
        val x = readDouble()

        val combustion = new GasFuelCombustion(elements, lambda, x)

        val fumes = combustion.getFumesVolumes
        var V0s: Double = 0.0
        var moleculeList = List[(Double, Component with Enthalpy)]()

        if (fumes.containsKey(CO)) {
          V0s += fumes.get(CO)
          moleculeList ::=(fumes.get(CO) / fumes.get(WET_FUMES), termo.components.gas.CO)
        }

        if (fumes.containsKey(CO2)) {
          V0s += fumes.get(CO2)
          moleculeList ::=(fumes.get(CO2) / fumes.get(WET_FUMES), termo.components.gas.CO2)
        }

        if (fumes.containsKey(HYDROGEN)) {
          V0s += fumes.get(HYDROGEN)
          moleculeList ::=(fumes.get(HYDROGEN) / fumes.get(WET_FUMES), termo.components.gas.H2)
        }

        if (fumes.containsKey(WATER)) {
          V0s += fumes.get(WATER)
          moleculeList ::=(fumes.get(WATER) / fumes.get(WET_FUMES), termo.components.gas.H2O)
        }

        if (fumes.containsKey(NITROGEN)) {
          V0s += fumes.get(NITROGEN)
          moleculeList ::=(fumes.get(NITROGEN) / fumes.get(WET_FUMES), termo.components.gas.N2)
        }

        if (fumes.containsKey(OXYGEN)) {
          V0s += fumes.get(OXYGEN)
          moleculeList ::=(fumes.get(OXYGEN) / fumes.get(WET_FUMES), termo.components.gas.O2)
        }
        val Qi = combustion.getHeatOfCombustion
        val i0 = Qi / V0s

        val molecule = Molecule(moleculeList)

        def opt(t: Double): Double = if (molecule.enthalpy(t) >= i0) t else opt(t + 0.1)
        println("calorimeter flame temperature: " + opt(1) + "°C")
      }
      case _ => println("ERROR")
    }
  }
}
