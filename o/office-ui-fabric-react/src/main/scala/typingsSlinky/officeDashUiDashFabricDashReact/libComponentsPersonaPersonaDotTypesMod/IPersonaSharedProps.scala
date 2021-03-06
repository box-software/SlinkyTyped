package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaCoinPersonaCoinDotBaseMod.PersonaCoinBase
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotBaseMod.PersonaBase
import typingsSlinky.react.Anon_Html
import typingsSlinky.react.reactMod.Booleanish
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.decimal
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.email
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.inherit
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.no
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.numeric
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.on
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.search
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.tel
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.url
import typingsSlinky.react.reactStrings.vertical
import typingsSlinky.react.reactStrings.yes
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaSharedProps extends HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional HTML element props for Persona coin.
    */
  var coinProps: js.UndefOr[IPersonaCoinProps] = js.undefined
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether to not render persona details, and just render the persona image/initials.
    */
  var hidePersonaDetails: js.UndefOr[Boolean] = js.undefined
  /**
    * Alt text for the image to use. Defaults to an empty string.
    */
  var imageAlt: js.UndefOr[String] = js.undefined
  /**
    * The user's initials to display in the image area when there is no image.
    * @defaultvalue [Derived from text]
    */
  var imageInitials: js.UndefOr[String] = js.undefined
  /**
    * If true, adds the css class 'is-fadeIn' to the image.
    */
  var imageShouldFadeIn: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables imageShouldFadeIn.
    * @defaultvalue false
    */
  var imageShouldStartVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from text]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.undefined
  /**
    * This flag can be used to signal the persona is out of office.
    * This will change the way the presence icon looks for statuses that support dual-presence.
    */
  var isOutOfOffice: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback for when loading state of the photo changes
    */
  var onPhotoLoadingStateChange: js.UndefOr[js.Function1[/* newImageLoadState */ ImageLoadState, Unit]] = js.undefined
  /**
    * Optional custom renderer for the coin
    * @deprecated Use `onRenderPersonaCoin` for custom rendering instead
    */
  var onRenderCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  /**
    * Optional custom renderer for the initials
    */
  var onRenderInitials: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  /**
    * Optional custom renderer for the coin
    */
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  /**
    * Optional text to display, usually a custom message set. The optional text will only be shown when using Size100.
    */
  var optionalText: js.UndefOr[String] = js.undefined
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @defaultvalue PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  /**
    * Presence title to be shown as a tooltip on hover over the presence icon.
    */
  var presenceTitle: js.UndefOr[String] = js.undefined
  /**
    * Primary text to display, usually the name of the person.
    * @deprecated Use `text` instead.
    */
  var primaryText: js.UndefOr[String] = js.undefined
  /**
    * Secondary text to display, usually the role of the user.
    */
  var secondaryText: js.UndefOr[String] = js.undefined
  /**
    * If true renders the initials while the image is loading.
    * This only applies when an imageUrl is provided.
    * @defaultvalue false
    */
  var showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.undefined
  var showSecondaryText: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, show the special coin for unknown persona.
    * It has '?' in place of initials, with static font and background colors
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.undefined
  /**
    * Tertiary text to display, usually the status of the user. The tertiary text will only be shown when using Size72 or Size100.
    */
  var tertiaryText: js.UndefOr[String] = js.undefined
  /**
    * Primary text to display, usually the name of the person.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IPersonaSharedProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    allowPhoneInitials: js.UndefOr[Boolean] = js.undefined,
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
    children: TagMod[Any] = null,
    className: String = null,
    coinProps: IPersonaCoinProps = null,
    coinSize: Int | Double = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hidePersonaDetails: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageAlt: String = null,
    imageInitials: String = null,
    imageShouldFadeIn: js.UndefOr[Boolean] = js.undefined,
    imageShouldStartVisible: js.UndefOr[Boolean] = js.undefined,
    imageUrl: String = null,
    initialsColor: PersonaInitialsColor | String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isOutOfOffice: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[
      EventTarget with (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement), 
      Event
    ] => Unit = null,
    onBlur: SyntheticFocusEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onChange: SyntheticEvent[
      EventTarget with (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement), 
      Event
    ] => Unit = null,
    onClick: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onCut: SyntheticClipboardEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDrag: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDragEnd: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDragEnter: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDragExit: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDragLeave: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDragOver: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDragStart: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDrop: DragEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onEnded: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onError: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onFocus: SyntheticFocusEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onInput: SyntheticEvent[
      EventTarget with (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement), 
      Event
    ] => Unit = null,
    onInvalid: SyntheticEvent[
      EventTarget with (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement), 
      Event
    ] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onLoad: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPause: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPhotoLoadingStateChange: /* newImageLoadState */ ImageLoadState => Unit = null,
    onPlay: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onProgress: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onRenderCoin: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null = null,
    onRenderInitials: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null = null,
    onReset: SyntheticEvent[
      EventTarget with (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement), 
      Event
    ] => Unit = null,
    onScroll: SyntheticUIEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onSelect: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onStalled: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onSubmit: SyntheticEvent[
      EventTarget with (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement), 
      Event
    ] => Unit = null,
    onSuspend: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onWaiting: SyntheticEvent[Event, PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    onWheel: SyntheticWheelEvent[PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    optionalText: String = null,
    placeholder: String = null,
    prefix: String = null,
    presence: PersonaPresence = null,
    presenceTitle: String = null,
    primaryText: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    secondaryText: String = null,
    security: String = null,
    showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.undefined,
    showSecondaryText: js.UndefOr[Boolean] = js.undefined,
    showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined,
    size: PersonaSize = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    tertiaryText: String = null,
    text: String = null,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): IPersonaSharedProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPhoneInitials)) __obj.updateDynamic("allowPhoneInitials")(allowPhoneInitials.asInstanceOf[js.Any])
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
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (coinProps != null) __obj.updateDynamic("coinProps")(coinProps.asInstanceOf[js.Any])
    if (coinSize != null) __obj.updateDynamic("coinSize")(coinSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePersonaDetails)) __obj.updateDynamic("hidePersonaDetails")(hidePersonaDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (imageInitials != null) __obj.updateDynamic("imageInitials")(imageInitials.asInstanceOf[js.Any])
    if (!js.isUndefined(imageShouldFadeIn)) __obj.updateDynamic("imageShouldFadeIn")(imageShouldFadeIn.asInstanceOf[js.Any])
    if (!js.isUndefined(imageShouldStartVisible)) __obj.updateDynamic("imageShouldStartVisible")(imageShouldStartVisible.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (initialsColor != null) __obj.updateDynamic("initialsColor")(initialsColor.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutOfOffice)) __obj.updateDynamic("isOutOfOffice")(isOutOfOffice.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
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
    if (onPhotoLoadingStateChange != null) __obj.updateDynamic("onPhotoLoadingStateChange")(js.Any.fromFunction1(onPhotoLoadingStateChange))
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
    if (onRenderCoin != null) __obj.updateDynamic("onRenderCoin")(js.Any.fromFunction2(onRenderCoin))
    if (onRenderInitials != null) __obj.updateDynamic("onRenderInitials")(js.Any.fromFunction2(onRenderInitials))
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2(onRenderPersonaCoin))
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
    if (optionalText != null) __obj.updateDynamic("optionalText")(optionalText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (presenceTitle != null) __obj.updateDynamic("presenceTitle")(presenceTitle.asInstanceOf[js.Any])
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(showInitialsUntilImageLoads)) __obj.updateDynamic("showInitialsUntilImageLoads")(showInitialsUntilImageLoads.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecondaryText)) __obj.updateDynamic("showSecondaryText")(showSecondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnknownPersonaCoin)) __obj.updateDynamic("showUnknownPersonaCoin")(showUnknownPersonaCoin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaSharedProps]
  }
}

