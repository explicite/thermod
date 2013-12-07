package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object H2 extends Component(0.00201588, 0.08988, 12756.0, 0.5) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (1e-3 * (4.184 / m * (6.62 * (t - T) + 0.00081 * (t * t - T * T) * .5)))
  }
}
