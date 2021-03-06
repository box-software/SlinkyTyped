package typingsSlinky.chaiDashSpies.Chai

import typingsSlinky.chaiDashSpies.ChaiSpies.Spy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc0
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc0Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc1
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc10
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc10Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc1Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc2
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc2Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc3
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc3Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc4
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc4Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc5
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc5Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc6
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc6Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc7
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc7Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc8
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc8Proxy
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc9
import typingsSlinky.chaiDashSpies.ChaiSpies.SpyFunc9Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiStatic extends js.Object {
  @JSName("spy")
  var spy_Original: Spy = js.native
  /**
    * #### chai.spy (function)
    *
    * Wraps a function in a proxy function. All calls will pass through to the original function.
    * ```ts
    * function original() {}
    * var spy = chai.spy(original)
    *   , e_spy = chai.spy();
    * ```
    * @param fn function to spy on. @default ```function () {}```
    * @returns function to actually call
    */
  def spy(): SpyFunc0Proxy[Unit] = js.native
  def spy[R](fn: SpyFunc0[R]): SpyFunc0Proxy[R] = js.native
  def spy[R](name: String, fn: SpyFunc0[R]): SpyFunc0Proxy[R] = js.native
  def spy[A1, R](fn: SpyFunc1[A1, R]): SpyFunc1Proxy[A1, R] = js.native
  def spy[A1, R](name: String, fn: SpyFunc1[A1, R]): SpyFunc1Proxy[A1, R] = js.native
  def spy[A1, A2, R](fn: SpyFunc2[A1, A2, R]): SpyFunc2Proxy[A1, A2, R] = js.native
  def spy[A1, A2, R](name: String, fn: SpyFunc2[A1, A2, R]): SpyFunc2Proxy[A1, A2, R] = js.native
  def spy[A1, A2, A3, R](fn: SpyFunc3[A1, A2, A3, R]): SpyFunc3Proxy[A1, A2, A3, R] = js.native
  def spy[A1, A2, A3, R](name: String, fn: SpyFunc3[A1, A2, A3, R]): SpyFunc3Proxy[A1, A2, A3, R] = js.native
  def spy[A1, A2, A3, A4, R](fn: SpyFunc4[A1, A2, A3, A4, R]): SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
  def spy[A1, A2, A3, A4, R](name: String, fn: SpyFunc4[A1, A2, A3, A4, R]): SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
  def spy[A1, A2, A3, A4, A5, R](fn: SpyFunc5[A1, A2, A3, A4, A5, R]): SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
  def spy[A1, A2, A3, A4, A5, R](name: String, fn: SpyFunc5[A1, A2, A3, A4, A5, R]): SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, R](fn: SpyFunc6[A1, A2, A3, A4, A5, A6, R]): SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, R](name: String, fn: SpyFunc6[A1, A2, A3, A4, A5, A6, R]): SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, R](fn: SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, R](name: String, fn: SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, R](fn: SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]): SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, R](name: String, fn: SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]): SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](fn: SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]): SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](name: String, fn: SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]): SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](fn: SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]): SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](name: String, fn: SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]): SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
}

