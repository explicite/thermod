package termo.components.gas

import termo.components.{Component, Enthalpy}

/**
 * @author Jan Paw 
 *         Date: 12/8/13
 */
object SO2 extends Component(64.0644, 2.926) with Enthalpy {
  def enthalpy(t: Double): Double = {
    d * (4.184 / m * (7.7 * (t - T) + 0.0053 * (t * t - T * T) * 0.5 - 0.0000083 * (t * t * t - T * T * T) / 3.0))
  }
}
