package typingsSlinky.chrome

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.chrome.chrome.declarativeContent.PageChangedEvent
import typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher
import typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties
import typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeContent extends js.Object {
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher
  ]
  var PageStateMatcherProperties: Instantiable0[typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties]
  var ShowPageAction: Instantiable0[typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction]
  var onPageChanged: PageChangedEvent
}

object TypeofdeclarativeContent {
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[PageStateMatcherProperties],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], PageStateMatcherProperties = PageStateMatcherProperties.asInstanceOf[js.Any], ShowPageAction = ShowPageAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
}

