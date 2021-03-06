package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object CO extends Component(28.0097, 1.250) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (4.184 / m * (6.6 * (t - T) + 0.0012 * (t * t - T * T) * 0.5))
  }
}
