package typingsSlinky.webpackDashServe

import typingsSlinky.webpack.webpackMod.Compiler
import typingsSlinky.webpack.webpackMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompilerStats extends js.Object {
  var compiler: Compiler
  var stats: Stats
}

object Anon_CompilerStats {
  @scala.inline
  def apply(compiler: Compiler, stats: Stats): Anon_CompilerStats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CompilerStats]
  }
}

