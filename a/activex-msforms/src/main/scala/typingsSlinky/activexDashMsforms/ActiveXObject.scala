package typingsSlinky.activexDashMsforms

import typingsSlinky.activexDashMsforms.MSForms.CheckBox
import typingsSlinky.activexDashMsforms.MSForms.ComboBox
import typingsSlinky.activexDashMsforms.MSForms.CommandButton
import typingsSlinky.activexDashMsforms.MSForms.Control
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Container_BeforeDragOver_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Container_BeforeDragOver_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Container_BeforeDropOrPaste_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Container_BeforeDropOrPaste_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Container_Scroll_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Container_Scroll_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Control_BeforeDragOver_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Control_BeforeDragOver_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Control_BeforeDropOrPaste_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Control_BeforeDropOrPaste_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Error_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.Error_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_BeforeDragOver_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_BeforeDragOver_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_BeforeDropOrPaste_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_BeforeDropOrPaste_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_Error_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_Error_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_Scroll_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.MultiPage_Scroll_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.TabStrip_BeforeDragOver_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.TabStrip_BeforeDragOver_Parameter
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.TabStrip_BeforeDropOrPaste_ArgNames
import typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes.TabStrip_BeforeDropOrPaste_Parameter
import typingsSlinky.activexDashMsforms.MSForms.Frame
import typingsSlinky.activexDashMsforms.MSForms.HTMLCheckbox
import typingsSlinky.activexDashMsforms.MSForms.HTMLHidden
import typingsSlinky.activexDashMsforms.MSForms.HTMLImage
import typingsSlinky.activexDashMsforms.MSForms.HTMLOption
import typingsSlinky.activexDashMsforms.MSForms.HTMLPassword
import typingsSlinky.activexDashMsforms.MSForms.HTMLReset
import typingsSlinky.activexDashMsforms.MSForms.HTMLSelect
import typingsSlinky.activexDashMsforms.MSForms.HTMLSubmit
import typingsSlinky.activexDashMsforms.MSForms.HTMLText
import typingsSlinky.activexDashMsforms.MSForms.HTMLTextArea
import typingsSlinky.activexDashMsforms.MSForms.Image
import typingsSlinky.activexDashMsforms.MSForms.Label
import typingsSlinky.activexDashMsforms.MSForms.ListBox
import typingsSlinky.activexDashMsforms.MSForms.MultiPage
import typingsSlinky.activexDashMsforms.MSForms.OptionButton
import typingsSlinky.activexDashMsforms.MSForms.ScrollBar
import typingsSlinky.activexDashMsforms.MSForms.SpinButton
import typingsSlinky.activexDashMsforms.MSForms.TabStrip
import typingsSlinky.activexDashMsforms.MSForms.TextBox
import typingsSlinky.activexDashMsforms.MSForms.ToggleButton
import typingsSlinky.activexDashMsforms.MSForms.UserForm
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.AddControl
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.AfterUpdate
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.BeforeDragOver
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.BeforeDropOrPaste
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.BeforeUpdate
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Button
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Cancel
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Change
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Click
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Column
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.DblClick
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.DropButtonClick
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Enter
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Error
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Exit
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Index
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.KeyAscii
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.KeyCode
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.KeyDown
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.KeyPress
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.KeyUp
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Layout
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.List
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.MouseDown
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.MouseMove
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.MouseUp
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Percent
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.RemoveControl
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Scroll
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Selected
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Shift
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.SpinDown
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.SpinUp
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.X
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Y
import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Zoom
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CheckBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Control,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Control,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: AddControl,
    argNames: js.Array[typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_Control, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: RemoveControl,
    argNames: js.Array[typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_Control, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: Zoom,
    argNames: js.Array[Percent],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Anon_Percent, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: AddControl,
    argNames: js.Tuple2[Index, typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_ControlIndex, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: Click,
    argNames: js.Array[Index],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_Index, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: DblClick,
    argNames: js.Tuple2[Index, Cancel],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_CancelIndex, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: Layout,
    argNames: js.Array[Index],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_Index, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: MouseDown,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_ButtonIndex, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: MouseMove,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_ButtonIndex, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: MouseUp,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_ButtonIndex, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: RemoveControl,
    argNames: js.Tuple2[Index, typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_ControlIndex, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: Zoom,
    argNames: js.Tuple2[Index, Percent],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ Anon_IndexPercent, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ScrollBar,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ScrollBar,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ScrollBar,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: SpinButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: SpinButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: SpinButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: Click,
    argNames: js.Array[Index],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_Index, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: DblClick,
    argNames: js.Tuple2[Index, Cancel],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_CancelIndex, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: MouseDown,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_ButtonIndex, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: MouseMove,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_ButtonIndex, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: MouseUp,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Anon_ButtonIndex, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: AddControl,
    argNames: js.Array[typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_Control, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: RemoveControl,
    argNames: js.Array[typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_Control, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: Zoom,
    argNames: js.Array[Percent],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Anon_Percent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: Control,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: CheckBox,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ComboBox,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: CommandButton,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: Frame,
    event: BeforeDragOver,
    argNames: Container_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Container_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: Image,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: Label,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ListBox,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: MultiPage,
    event: BeforeDragOver,
    argNames: MultiPage_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPage_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: OptionButton,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ScrollBar,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: SpinButton,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: TabStrip,
    event: BeforeDragOver,
    argNames: TabStrip_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ TabStrip_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: TextBox,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ToggleButton,
    event: BeforeDragOver,
    argNames: Control_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Control_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: UserForm,
    event: BeforeDragOver,
    argNames: Container_BeforeDragOver_ArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Container_BeforeDragOver_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: CheckBox,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ComboBox,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: CommandButton,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: Frame,
    event: BeforeDropOrPaste,
    argNames: Container_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Container_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: Image,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: Label,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ListBox,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: MultiPage,
    event: BeforeDropOrPaste,
    argNames: MultiPage_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPage_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: OptionButton,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ScrollBar,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: SpinButton,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: TabStrip,
    event: BeforeDropOrPaste,
    argNames: TabStrip_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ TabStrip_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: TextBox,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ToggleButton,
    event: BeforeDropOrPaste,
    argNames: Control_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Control_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: UserForm,
    event: BeforeDropOrPaste,
    argNames: Container_BeforeDropOrPaste_ArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Container_BeforeDropOrPaste_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: CheckBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ComboBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ListBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: MultiPage,
    event: Change,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OptionButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ScrollBar,
    event: Change,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: SpinButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TabStrip,
    event: Change,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TextBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ToggleButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CheckBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ComboBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CommandButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Frame,
    event: Click,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLCheckbox,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLCheckbox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLHidden,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLHidden, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLImage,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLImage, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLPassword,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLPassword, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLReset,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLReset, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLSelect,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLSelect, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLSubmit,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLSubmit, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLTextArea,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLTextArea, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLText,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLText, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Image,
    event: Click,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Label,
    event: Click,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ListBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ToggleButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: UserForm,
    event: Click,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: ComboBox,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: TextBox,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: Control,
    event: Enter,
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: CheckBox,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ComboBox,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: CommandButton,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: Frame,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: Image,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: Label,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ListBox,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: MultiPage,
    event: Error,
    argNames: MultiPage_Error_ArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPage_Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: OptionButton,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ScrollBar,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: SpinButton,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: TabStrip,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: TextBox,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ToggleButton,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: UserForm,
    event: Error,
    argNames: Error_ArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Error_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Layout(
    obj: Frame,
    event: Layout,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Layout(
    obj: UserForm,
    event: Layout,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: Frame,
    event: Scroll,
    argNames: Container_Scroll_ArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ Container_Scroll_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: MultiPage,
    event: Scroll,
    argNames: MultiPage_Scroll_ArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPage_Scroll_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: ScrollBar,
    event: Scroll,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: UserForm,
    event: Scroll,
    argNames: Container_Scroll_ArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ Container_Scroll_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SpinDown(
    obj: SpinButton,
    event: SpinDown,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SpinUp(
    obj: SpinButton,
    event: SpinUp,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Column(obj: ComboBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Column(obj: ComboBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_Column(obj: ComboBox, propertyName: Column, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Column(obj: ListBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Column(obj: ListBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_Column(obj: ListBox, propertyName: Column, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_List(obj: ComboBox, propertyName: List, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ListBox, propertyName: List, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ListBox, propertyName: List, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_List(obj: ListBox, propertyName: List, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Selected(obj: ListBox, propertyName: Selected, parameterTypes: js.Array[_], newValue: Boolean): Unit = js.native
}

