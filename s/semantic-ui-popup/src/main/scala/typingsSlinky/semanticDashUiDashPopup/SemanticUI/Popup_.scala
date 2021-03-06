package typingsSlinky.semanticDashUiDashPopup.SemanticUI

import typingsSlinky.semanticDashUiDashPopup.JQuery
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`bind clickaway`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`bind close on scroll`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`bind touch close`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`change content`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`get popup`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`hide all`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`is hidden`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`is visible`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`remove popup`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.`set position`
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.destroy
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.exists
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.hide
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.reposition
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.setting
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.show
import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Popup")
@js.native
trait Popup_ extends js.Object {
  var settings: PopupSettings = js.native
  def apply(): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  def apply(behavior: `change content`, html: String): JQuery = js.native
  /**
    * Returns current popup dom element
    */
  def apply(behavior: `get popup`): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  def apply(behavior: `hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes popup from the page
    */
  def apply(behavior: `remove popup`): JQuery = js.native
  /**
    * Repositions a popup
    */
  def apply(behavior: `set position`, position: String): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  def apply(behavior: exists): Boolean = js.native
  /**
    * Hides popup
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  def apply(behavior: reposition): JQuery = js.native
  def apply(behavior: setting, value: PopupSettings): JQuery = js.native
  /**
    * Shows popup
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: PopupSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

