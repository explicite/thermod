package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object H2O extends Component(0.01801488, 0.554) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (1e-3 * (4.184 / m * (8.22 * (t - T) + 0.00015 * (t * t - T * T) * 0.5 + 0.00000134 * (t * t * t - T * T * T) / 3.0)))
  }
}
