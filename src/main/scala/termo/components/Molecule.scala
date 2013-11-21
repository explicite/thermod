package termo.components

/**
 * @param m list of tuples (Double, Component with Enthalpy)
 * @author Jan Paw
 *         Date: 11/21/13
 */
case class Molecule(m: List[(Double, Component with Enthalpy)]) extends Enthalpy {
  def enthalpy(t: Double): Double = m.map(x => x._1 * x._2.enthalpy(t)).reduce((total, cur) => total + cur)
}
