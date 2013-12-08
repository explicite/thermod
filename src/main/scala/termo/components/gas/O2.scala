package termo.components.gas

import termo.components.{Enthalpy, Component}

/**
 * @author Jan Paw
 *         Date: 11/21/13
 */
object O2 extends Component(0.031998, 1.429) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (1e-3 * (4.184 / m * (8.27 * (t - T) + 0.000258 * (t * t - T * T) * 0.5 + 187700.0 * (1.0 / t - 1.0 / T))))
  }
}
