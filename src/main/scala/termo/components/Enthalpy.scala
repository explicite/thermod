package termo.components

/**
 * @author Jan Paw
 *         Date: 11/19/13
 */
trait Enthalpy {
  /**
   * Reference temperature for enthalpies
   */
  val T: Double = 273.15

  /**
   * J/mol*K
   */
  val R: Double = 8.314472

  /**
   * kW/m2*k4
   */
  val Σ: Double = 5.67e-11

  /**
   * m/s2
   */
  val g: Double = 9.80665

  /**
   * m3/mol
   */
  val V: Double = 0.022414

  def enthalpy(t: Double): Double
}
