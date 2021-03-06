package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", JSImport.Namespace)
@js.native
object libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod extends js.Object {
  @js.native
  class BaseExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class ExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}

