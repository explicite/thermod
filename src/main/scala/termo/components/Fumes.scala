package termo.components

/**
 * TODO redesign/refactor!
 * @author Jan Paw
 *         Date: 11/25/13
 */
object Fumes {

  def cp(f: String, t: Double): Double = f match {
    case "blastFurnanceGas" => blastFurnaceGas.get(t) getOrElse (-1.0)
    case "cokeOvenGas" => cokeOvenGas.get(t) getOrElse (-1.0)
    case "naturalGas" => naturalGas.get(t) getOrElse (-1.0)
    case "liquidFuels" => liquidFuels.get(t) getOrElse (-1.0)
    case "solidFuels" => solidFuels.get(t) getOrElse (-1.0)
    case _ => throw new Error("cannot find fume")
  }

  val blastFurnaceGas = Map[Double, Double](
    0.0 -> 1.39,
    200.0 -> 1.431,
    400.0 -> 1.478,
    600.0 -> 1.519,
    800.0 -> 1.562,
    1000.0 -> 1.598,
    1200.0 -> 1.633,
    1400.0 -> 1.661,
    1600.0 -> 1.687,
    1800.0 -> 1.717,
    2000.0 -> 1.724,
    2200.0 -> 1.737,
    2400.0 -> 1.763
  )

  val cokeOvenGas = Map[Double, Double](
    0.0 -> 1.363,
    200.0 -> 1.394,
    400.0 -> 1.427,
    600.0 -> 1.465,
    800.0 -> 1.498,
    1000.0 -> 1.537,
    1200.0 -> 1.566,
    1400.0 -> 1.598,
    1600.0 -> 1.624,
    1800.0 -> 1.641,
    2000.0 -> 1.661,
    2200.0 -> 1.678,
    2400.0 -> 1.704
  )

  val naturalGas = Map[Double, Double](
    0.0 -> 1.368,
    200.0 -> 1.390,
    400.0 -> 1.439,
    600.0 -> 1.494,
    800.0 -> 1.537,
    1000.0 -> 1.595,
    1200.0 -> 1.653,
    1400.0 -> 1.687,
    1600.0 -> 1.728,
    1800.0 -> 1.768,
    2000.0 -> 1.808,
    2200.0 -> 1.838,
    2400.0 -> 1.874
  )

  val liquidFuels = Map[Double, Double](
    0.0 -> 1.364,
    200.0 -> 1.407,
    400.0 -> 1.443,
    600.0 -> 1.474,
    800.0 -> 1.515,
    1000.0 -> 1.549,
    1200.0 -> 1.586,
    1400.0 -> 1.616,
    1600.0 -> 1.633,
    1800.0 -> 1.653,
    2000.0 -> 1.674,
    2200.0 -> 1.691,
    2400.0 -> 1.708
  )

  val solidFuels = Map[Double, Double](
    0.0 -> 1.364,
    200.0 -> 1.411,
    400.0 -> 1.453,
    600.0 -> 1.494,
    800.0 -> 1.528,
    1000.0 -> 1.562,
    1200.0 -> 1.587,
    1400.0 -> 1.629,
    1600.0 -> 1.649,
    1800.0 -> 1.680,
    2000.0 -> 1.691,
    2200.0 -> 1.713,
    2400.0 -> 1.720
  )
}
