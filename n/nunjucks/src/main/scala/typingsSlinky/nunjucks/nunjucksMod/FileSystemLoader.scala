package typingsSlinky.nunjucks.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.nunjucks.nunjucksMod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "FileSystemLoader")
@js.native
class FileSystemLoader () extends Loader {
  def this(searchPaths: String) = this()
  def this(searchPaths: js.Array[String]) = this()
  def this(searchPaths: String, opts: FileSystemLoaderOptions) = this()
  def this(searchPaths: js.Array[String], opts: FileSystemLoaderOptions) = this()
  var async: js.UndefOr[Boolean] = js.native
  def getSource(name: String): LoaderSource = js.native
  def getSource(name: String, callback: Callback[js.Error, LoaderSource]): Unit = js.native
  def init(searchPaths: js.Array[String], opts: js.Any): Unit = js.native
}

