package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotBaseMod

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroup
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroup.base", "ChoiceGroupBase")
@js.native
class ChoiceGroupBase protected ()
  extends Component[IChoiceGroupProps, IChoiceGroupState, js.Any]
     with IChoiceGroup {
  def this(props: IChoiceGroupProps) = this()
  var _changeCallbacks: js.Any = js.native
  var _focusCallbacks: js.Any = js.native
  /**
    * Returns `selectedKey` if provided, or the key of the first option with the `checked` prop set.
    */
  var _getKeyChecked: js.Any = js.native
  var _getOptionId: js.Any = js.native
  var _id: js.Any = js.native
  var _labelId: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onChange: js.Any = js.native
  var _onFocus: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MChoiceGroupBase(prevProps: IChoiceGroupProps, prevState: IChoiceGroupState): Unit = js.native
  /**
    * Sets focus to the checked option or the first enabled option in the ChoiceGroup.
    */
  /* CompleteClass */
  override def focus(): Unit = js.native
}

