package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotBaseMod.ICheckboxState
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Checkbox", JSImport.Namespace)
@js.native
object libCheckboxMod extends js.Object {
  @js.native
  class CheckboxBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCheckboxMod.CheckboxBase {
    /**
      * Initialize a new instance of the Checkbox
      * @param props - Props for the component
      * @param context - Context or initial state for the base component.
      */
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
  }
  
  val Checkbox: ReactComponentClass[ICheckboxProps] = js.native
  /* static members */
  @js.native
  object CheckboxBase extends js.Object {
    var defaultProps: ICheckboxProps = js.native
    def getDerivedStateFromProps(nextProps: ICheckboxProps, prevState: ICheckboxState): ICheckboxState | Null = js.native
  }
  
}

