package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object CO extends Component(0.0280097, 1.250, 12629.0, 0.5) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (1e-3 * (4.184 / m * (6.6 * (t - T) + 0.0012 * (t * t - T * T) * .5)))
  }
}