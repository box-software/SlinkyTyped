package typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod

import typingsSlinky.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentData
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query because Already inherited
- typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.CollectionReference because Inheritance from two classes. Inlined id, parent, path, add, doc, doc, isEqual */ @JSImport("@firebase/firestore/dist/src/api/database", "CollectionReference")
@js.native
class CollectionReference[T] protected () extends Query[T] {
  def this(_path: ResourcePath, firestore: Firestore) = this()
  def this(_path: ResourcePath, firestore: Firestore, _converter: FirestoreDataConverter[T]) = this()
  val _path: ResourcePath = js.native
  @JSName("id")
  val id_FCollectionReference: String = js.native
  @JSName("parent")
  val parent_FCollectionReference: typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[DocumentData] | Null = js.native
  @JSName("path")
  val path_FCollectionReference: String = js.native
  def add(value: T): js.Promise[
    typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[T]
  ] = js.native
  def doc(): typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[T] = js.native
  def doc(pathString: String): typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[T] = js.native
  def id(): String = js.native
  def isEqual(
    other: typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.CollectionReference[T]
  ): Boolean = js.native
  def parent(): typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[DocumentData] | Null = js.native
  def path(): String = js.native
}

