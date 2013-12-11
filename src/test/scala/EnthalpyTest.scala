import org.scalatest.FunSuite
import termo.components.gas._

/**
 * @author Jan Paw
 *         Date: 12/2/13
 */
class EnthalpyTest extends FunSuite {
  test("Air enthalpy test") {
    assert(Air.enthalpy(24.85) == -73323.8103352424)
  }

  test("CO enthalpy test") {
    assert(CO.enthalpy(24.85) == 30.570061593840705)
  }

  test("CO2 enthalpy test") {
    assert(CO2.enthalpy(24.85) == -365930.07502613484)
  }

  test("H2 enthalpy test") {
    assert(H2.enthalpy(24.85) == 30611.573700449047)
  }

  test("N2 enthalpy test") {
    assert(N2.enthalpy(24.85) == 30.106866031584527)
  }

  test("O2 enthalpy test") {
    assert(O2.enthalpy(24.85) == -349274.2607590826)
  }

  test("H20 enthalpy test") {
    assert(H2O.enthalpy(24.85) == 47262.947840138106)
  }

  test("SO2 enthalpy test") {
    assert(SO2.enthalpy(24.85) == 36.72251841093088)
  }
}
