package typingsSlinky.momentDashJalaali.momentDashJalaaliMod

import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.moment.momentMod.MomentFormatSpecification
import typingsSlinky.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-jalaali", "utc")
@js.native
object utc extends js.Object {
  def apply(): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
}

