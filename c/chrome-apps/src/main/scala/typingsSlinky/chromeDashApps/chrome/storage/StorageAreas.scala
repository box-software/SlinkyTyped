package typingsSlinky.chromeDashApps.chrome.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.local
  - typings.chromeDashApps.chromeDashAppsStrings.sync
  - typings.chromeDashApps.chromeDashAppsStrings.managed
*/
trait StorageAreas extends js.Object

object StorageAreas {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typingsSlinky.chromeDashApps.chromeDashAppsStrings.local = this.cast("local")
  @scala.inline
  def managed: typingsSlinky.chromeDashApps.chromeDashAppsStrings.managed = this.cast("managed")
  @scala.inline
  def sync: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sync = this.cast("sync")
}

