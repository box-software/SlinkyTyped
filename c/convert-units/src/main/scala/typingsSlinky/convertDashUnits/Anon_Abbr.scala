package typingsSlinky.convertDashUnits

import typingsSlinky.convertDashUnits.convertDashUnitsMod.measure
import typingsSlinky.convertDashUnits.convertDashUnitsMod.system
import typingsSlinky.convertDashUnits.convertDashUnitsMod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abbr[T /* <: unit */] extends js.Object {
  var abbr: T
  var measure: typingsSlinky.convertDashUnits.convertDashUnitsMod.measure
  var system: typingsSlinky.convertDashUnits.convertDashUnitsMod.system
  var unit: Anon_Name
}

object Anon_Abbr {
  @scala.inline
  def apply[T /* <: unit */](abbr: T, measure: measure, system: system, unit: Anon_Name): Anon_Abbr[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Abbr[T]]
  }
}

