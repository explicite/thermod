import org.scalatest.FunSuite
import termo.components.gas._

/**
 * @author Jan Paw
 *         Date: 12/2/13
 */
class EnthalpyTest extends FunSuite {
  test("Air enthalpy test") {
    assert(Air.enthalpy(100) == -164.57860756747039)
  }

  test("CO enthalpy test") {
    assert(CO.enthalpy(0.0) == -344.9776604106791)
  }

  test("CO2 enthalpy test") {
    assert(CO2.enthalpy(0.0) == -497.43192086707825)
  }

  test("H2 enthalpy test") {
    assert(H2.enthalpy(0.0) == -342.9625590239676)
  }

  test("N2 enthalpy test") {
    assert(N2.enthalpy(0.0) == -308.11534429780244)
  }

  test("O2 enthalpy test") {
    assert(O2.enthalpy(100.0) == -46.79810101742289)
  }

  test("H20 enthalpy test") {
    assert(H2O.enthalpy(0.0) == -290.78831080045103)
  }
}
