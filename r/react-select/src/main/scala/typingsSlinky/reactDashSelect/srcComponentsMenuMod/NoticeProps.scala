package typingsSlinky.reactDashSelect.srcComponentsMenuMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.reactDashSelect.srcSelectMod.Props
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.ClassNamesState
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children  :react.react.ReactNode,   innerProps  :{[key: string] : any}} */
@js.native
trait NoticeProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /** The children to be rendered. */
  var children: TagMod[Any] = js.native
  var className: js.UndefOr[String] = js.native
  var hasValue: Boolean = js.native
  /** Props to be passed on to the wrapper. */
  var innerProps: StringDictionary[js.Any] = js.native
  var isMulti: Boolean = js.native
  var options: OptionsType[OptionType] = js.native
  var selectProps: Props[OptionType] = js.native
  def clearValue(): Unit = js.native
  def cx(): String | Unit = js.native
  def cx(a: String): String | Unit = js.native
  def cx(a: String, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
  def cx(a: String, b: ClassNamesState): String | Unit = js.native
  def cx(a: Null, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
  def cx(a: Null, b: ClassNamesState): String | Unit = js.native
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  def getValue(): ValueType[OptionType] = js.native
  def selectOption(option: OptionType): Unit = js.native
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

