package typingsSlinky.cypress

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cypress.Chai.ChaiStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai", JSImport.Namespace)
@js.native
object chaiMod extends TopLevel[ChaiStatic] {
  @js.native
  class AssertionError protected ()
    extends typingsSlinky.cypress.Chai.AssertionError {
    def this(message: String) = this()
    def this(message: String, _props: js.Any) = this()
    def this(message: String, _props: js.Any, ssf: js.Function) = this()
  }
  
}

