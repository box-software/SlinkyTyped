package typingsSlinky.reactDashSelect

import slinky.core.TagMod
import typingsSlinky.reactDashSelect.srcTypesMod.GroupType
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/builtins", JSImport.Namespace)
@js.native
object srcBuiltinsMod extends js.Object {
  def formatGroupLabel(group: GroupType[_]): TagMod[Any] = js.native
  def getOptionLabel(option: js.Any): String = js.native
  def getOptionValue(option: js.Any): String = js.native
  def isOptionDisabled(option: js.Any): Boolean = js.native
  type formatGroupLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* group */ GroupType[OptionType], TagMod[Any]]
  type getOptionLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  type getOptionValue[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  type isOptionDisabled[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, Boolean]
}

