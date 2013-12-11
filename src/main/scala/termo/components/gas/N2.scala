package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object N2 extends Component(28.0134, 1.2506) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (4.184 / m * (6.5 * (t - T) + 0.001 * (t * t - T * T) * 0.5))
  }
}
