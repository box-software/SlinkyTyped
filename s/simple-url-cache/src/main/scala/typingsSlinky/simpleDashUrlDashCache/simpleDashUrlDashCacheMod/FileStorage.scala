package typingsSlinky.simpleDashUrlDashCache.simpleDashUrlDashCacheMod

import typingsSlinky.simpleDashUrlDashCache.simpleDashUrlDashCacheMod.privateN.CacheCategory
import typingsSlinky.simpleDashUrlDashCache.simpleDashUrlDashCacheMod.privateN.CacheStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-url-cache", "FileStorage")
@js.native
class FileStorage protected ()
  extends CacheCategory
     with CacheStorage {
  def this(_url: String, _storageConfig: FileStorageConfig, _regexRules: CacheRules) = this()
  /* CompleteClass */
  /* private */ override def getCacheCategory(): String = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getCurrentUrl(): String = js.native
  /* CompleteClass */
  /* private */ override def getRegexTest(u: RegexRule): Boolean = js.native
}

