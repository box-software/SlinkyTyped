package typingsSlinky.reactDashSelect

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactDashSelect.srcAnimatedTransitionsMod.fn
import typingsSlinky.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps
import typingsSlinky.reactDashSelect.srcSelectMod.Props
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.ClassNamesState
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/MultiValue", JSImport.Namespace)
@js.native
object srcAnimatedMultiValueMod extends js.Object {
  /* Inlined {  in  :boolean,   onExited  :react-select.react-select/src/animated/transitions.fn} & react-select.react-select/src/components/MultiValue.MultiValueProps<OptionType> */
  @js.native
  trait AnimatedMultiValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    var children: TagMod[Any] = js.native
    var className: js.UndefOr[String] = js.native
    var components: js.Any = js.native
    var cropWithEllipsis: Boolean = js.native
    var data: OptionType = js.native
    var hasValue: Boolean = js.native
    var in: Boolean = js.native
    var innerProps: js.Any = js.native
    var isDisabled: Boolean = js.native
    var isFocused: Boolean = js.native
    var isMulti: Boolean = js.native
    var onExited: fn = js.native
    var options: OptionsType[OptionType] = js.native
    var removeProps: Anon_Event = js.native
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
  
  def AnimatedMultiValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[MultiValueProps[OptionType]]): ReactComponentClass[AnimatedMultiValueProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[MultiValueProps[OptionType]]): ReactComponentClass[AnimatedMultiValueProps[OptionType]] = js.native
}

