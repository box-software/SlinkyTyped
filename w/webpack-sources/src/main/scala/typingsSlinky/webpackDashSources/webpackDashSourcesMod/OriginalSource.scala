package typingsSlinky.webpackDashSources.webpackDashSourcesMod

import typingsSlinky.sourceDashMap.sourceDashMapMod.RawSourceMap
import typingsSlinky.sourceDashMap.sourceDashMapMod.SourceNode
import typingsSlinky.webpackDashSources.Anon_Columns
import typingsSlinky.webpackDashSources.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "OriginalSource")
@js.native
class OriginalSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: String, name: String) = this()
  var _name: String = js.native
  var _value: String = js.native
  /* CompleteClass */
  override def map(options: Anon_Columns): RawSourceMap = js.native
  def node(options: Anon_Columns): SourceNode = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Anon_Columns): Anon_Map = js.native
}

