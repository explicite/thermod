package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object CO2 extends Component(0.0440087, 1.7878, 0, 0) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (1e-3 * (4.184 / m * (10.34 * (t - T) + 0.00274 * (t * t - T * T) * .5 + 195500 * (1 / T - 1 / T))))
  }
}
