package typingsSlinky.atMaterialDashUiCore.fabFabMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.atMaterialDashUiCore.PartialClassNameMapFabClassKey
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypes.Color
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.button
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.decimal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.email
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.extended
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.inherit
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.large
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.medium
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.no
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.numeric
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.on
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.reset
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.round
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.search
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.small
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.submit
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tel
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.url
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.yes
import typingsSlinky.atMaterialDashUiCore.buttonBaseButtonBaseMod.ButtonBaseActions
import typingsSlinky.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleProps
import typingsSlinky.react.Anon_Html
import typingsSlinky.react.reactMod.AnimationEventHandler
import typingsSlinky.react.reactMod.Booleanish
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.ClipboardEventHandler
import typingsSlinky.react.reactMod.CompositionEventHandler
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod.DragEventHandler
import typingsSlinky.react.reactMod.FocusEventHandler
import typingsSlinky.react.reactMod.FormEventHandler
import typingsSlinky.react.reactMod.KeyboardEventHandler
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod.PointerEventHandler
import typingsSlinky.react.reactMod.ReactEventHandler
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.react.reactMod.TouchEventHandler
import typingsSlinky.react.reactMod.TransitionEventHandler
import typingsSlinky.react.reactMod.UIEventHandler
import typingsSlinky.react.reactMod.WheelEventHandler
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, @material-ui/core.@material-ui/core/Fab/Fab.FabClassKey, 'component'> */
@js.native
trait FabProps extends js.Object {
  var TouchRippleProps: js.UndefOr[
    Partial[typingsSlinky.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleProps]
  ] = js.native
  var about: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var action: js.UndefOr[js.Function1[/* actions */ ButtonBaseActions, Unit]] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var buttonRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  var centerRipple: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapFabClassKey] = js.native
  var color: js.UndefOr[Color] = js.native
  var component: js.UndefOr[ReactComponentClass[FabProps]] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var disableRipple: js.UndefOr[Boolean] = js.native
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var download: js.UndefOr[js.Any] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var focusRipple: js.UndefOr[Boolean] = js.native
  var focusVisibleClassName: js.UndefOr[String] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var href: js.UndefOr[String] = js.native
  var hrefLang: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var media: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  var onFocusVisible: js.UndefOr[FocusEventHandler[_]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLElement]] = js.native
  var ping: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var referrerPolicy: js.UndefOr[String] = js.native
  var rel: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var `type`: js.UndefOr[submit | reset | button] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var variant: js.UndefOr[round | extended] = js.native
  var vocab: js.UndefOr[String] = js.native
}

object FabProps {
  @scala.inline
  def apply(
    TouchRippleProps: Partial[TouchRippleProps] = null,
    about: String = null,
    accessKey: String = null,
    action: /* actions */ ButtonBaseActions => Unit = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    buttonRef: Ref[_] | ReactRef[_] = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    classes: PartialClassNameMapFabClassKey = null,
    color: Color = null,
    component: ReactComponentClass[FabProps] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    hrefLang: String = null,
    id: String = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    media: String = null,
    name: String = null,
    onAbort: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[HTMLElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onDrag: DragEvent[HTMLElement] => Unit = null,
    onDragEnd: DragEvent[HTMLElement] => Unit = null,
    onDragEnter: DragEvent[HTMLElement] => Unit = null,
    onDragExit: DragEvent[HTMLElement] => Unit = null,
    onDragLeave: DragEvent[HTMLElement] => Unit = null,
    onDragOver: DragEvent[HTMLElement] => Unit = null,
    onDragStart: DragEvent[HTMLElement] => Unit = null,
    onDrop: DragEvent[HTMLElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onEnded: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onError: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLElement] => Unit = null,
    onFocusVisible: SyntheticFocusEvent[_] => Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onLoad: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLElement] => Unit = null,
    onPause: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onPlay: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onProgress: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onSelect: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onStalled: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit = null,
    onSuspend: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onWaiting: SyntheticEvent[Event, HTMLElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLElement] => Unit = null,
    ping: String = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    referrerPolicy: String = null,
    rel: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    size: small | medium | large = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    target: String = null,
    title: String = null,
    translate: yes | no = null,
    `type`: submit | reset | button = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: String | js.Array[String] | Double = null,
    variant: round | extended = null,
    vocab: String = null
  ): FabProps = {
    val __obj = js.Dynamic.literal()
    if (TouchRippleProps != null) __obj.updateDynamic("TouchRippleProps")(TouchRippleProps.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (buttonRef != null) __obj.updateDynamic("buttonRef")(buttonRef.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(focusRipple)) __obj.updateDynamic("focusRipple")(focusRipple.asInstanceOf[js.Any])
    if (focusVisibleClassName != null) __obj.updateDynamic("focusVisibleClassName")(focusVisibleClassName.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusVisible != null) __obj.updateDynamic("onFocusVisible")(js.Any.fromFunction1(onFocusVisible))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (ping != null) __obj.updateDynamic("ping")(ping.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[FabProps]
  }
}

