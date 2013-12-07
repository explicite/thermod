package termo.components

/**
 * @param m molar mas of component [kg/mol]
 * @param d density of component [kg/m3]
 * @param qs heating value [kJ/m3]
 * @param ot theoretical oxygen [O2/kg]
 * @author Jan Paw
 *         Date: 11/19/13
 */
case class Component(m: Double, d: Double, qs: Double, ot: Double)
