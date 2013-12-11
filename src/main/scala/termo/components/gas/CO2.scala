package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object CO2 extends Component(44.0087, 1.977) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (4.184 / m * (10.34 * (t - T) + 0.00274 * (t * t - T * T) * 0.5 + 195500 * (1.0 / t - 1.0 / T)))
  }
}
