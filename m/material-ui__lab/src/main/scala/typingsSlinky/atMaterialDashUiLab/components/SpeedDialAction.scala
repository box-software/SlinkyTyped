package typingsSlinky.atMaterialDashUiLab.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.atMaterialDashUiCore.PartialClassNameMapTooltipClassKey
import typingsSlinky.atMaterialDashUiCore.transitionsTransitionMod.TransitionProps
import typingsSlinky.atMaterialDashUiLab.PartialClassNameMapSpeedDialActionClassKey
import typingsSlinky.atMaterialDashUiLab.PartialFabProps
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`additions text`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`bottom-end`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`bottom-start`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`inline`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`left-end`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`left-start`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`right-end`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`right-start`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`top-end`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.`top-start`
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.additions
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.all
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.ascending
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.assertive
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.both
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.bottom
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.copy
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.date
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.decimal
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.descending
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.dialog
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.email
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.execute
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.grammar
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.grid
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.horizontal
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.left
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.link
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.list
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.listbox
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.location
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.menu
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.mixed
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.move
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.no
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.none
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.numeric
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.off
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.on
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.other
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.page
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.polite
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.popup
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.removals
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.right
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.search
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.spelling
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.step
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.tel
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.text
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.time
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.top
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.tree
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.url
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.vertical
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.yes
import typingsSlinky.atMaterialDashUiLab.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SpeedDialAction
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@material-ui/lab/SpeedDialAction/SpeedDialAction", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, contentEditable, dangerouslySetInnerHTML, defaultChecked, defaultValue, dir, draggable, hidden, id, lang, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, open, placeholder, spellCheck, suppressContentEditableWarning, tabIndex */
  def apply(
    FabProps: PartialFabProps = null,
    PopperProps: js.Object = null,
    TooltipClasses: PartialClassNameMapTooltipClassKey = null,
    TransitionComponent: ReactComponentClass[TransitionProps] = null,
    TransitionProps: TransitionProps = null,
    about: String = null,
    accessKey: String = null,
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
    autoSave: String = null,
    classes: PartialClassNameMapSpeedDialActionClassKey = null,
    color: String = null,
    contextMenu: String = null,
    datatype: String = null,
    delay: Int | Double = null,
    disableFocusListener: js.UndefOr[Boolean] = js.undefined,
    disableHoverListener: js.UndefOr[Boolean] = js.undefined,
    disableTouchListener: js.UndefOr[Boolean] = js.undefined,
    enterDelay: Int | Double = null,
    enterTouchDelay: Int | Double = null,
    icon: TagMod[Any] = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    leaveDelay: Int | Double = null,
    leaveTouchDelay: Int | Double = null,
    onAuxClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    placement: `bottom-end` | `bottom-start` | bottom | `left-end` | `left-start` | left | `right-end` | `right-start` | right | `top-end` | `top-start` | top = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    style: CSSProperties = null,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null,
    tooltipOpen: js.UndefOr[Boolean] = js.undefined,
    tooltipPlacement: `bottom-end` | `bottom-start` | bottom | `left-end` | `left-start` | left | `right-end` | `right-start` | right | `top-end` | `top-start` | top = null,
    tooltipTitle: TagMod[Any] = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (FabProps != null) __obj.updateDynamic("FabProps")(FabProps.asInstanceOf[js.Any])
    if (PopperProps != null) __obj.updateDynamic("PopperProps")(PopperProps.asInstanceOf[js.Any])
    if (TooltipClasses != null) __obj.updateDynamic("TooltipClasses")(TooltipClasses.asInstanceOf[js.Any])
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
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
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusListener)) __obj.updateDynamic("disableFocusListener")(disableFocusListener.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHoverListener)) __obj.updateDynamic("disableHoverListener")(disableHoverListener.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchListener)) __obj.updateDynamic("disableTouchListener")(disableTouchListener.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (enterTouchDelay != null) __obj.updateDynamic("enterTouchDelay")(enterTouchDelay.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (leaveDelay != null) __obj.updateDynamic("leaveDelay")(leaveDelay.asInstanceOf[js.Any])
    if (leaveTouchDelay != null) __obj.updateDynamic("leaveTouchDelay")(leaveTouchDelay.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipOpen)) __obj.updateDynamic("tooltipOpen")(tooltipOpen.asInstanceOf[js.Any])
    if (tooltipPlacement != null) __obj.updateDynamic("tooltipPlacement")(tooltipPlacement.asInstanceOf[js.Any])
    if (tooltipTitle != null) __obj.updateDynamic("tooltipTitle")(tooltipTitle.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SpeedDialActionProps
}

