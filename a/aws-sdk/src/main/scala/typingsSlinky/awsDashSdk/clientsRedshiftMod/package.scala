package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRedshiftMod {
  import typingsSlinky.awsDashSdk.awsDashSdkStrings.ResizeCluster
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccountsWithRestoreAccessList = js.Array[AccountWithRestoreAccess]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`restore-cluster`
    - typings.awsDashSdk.awsDashSdkStrings.`recommend-node-config`
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type AssociatedClusterList = js.Array[ClusterAssociatedToSchedule]
  type AttributeList = js.Array[AccountAttribute]
  type AttributeNameList = js.Array[String]
  type AttributeValueList = js.Array[AttributeValueTarget]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type BatchSnapshotOperationErrorList = js.Array[SnapshotErrorMessage]
  type BatchSnapshotOperationErrors = js.Array[SnapshotErrorMessage]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterDbRevisionsList = js.Array[ClusterDbRevision]
  type ClusterIamRoleList = js.Array[ClusterIamRole]
  type ClusterList = js.Array[Cluster]
  type ClusterNodesList = js.Array[ClusterNode]
  type ClusterParameterGroupStatusList = js.Array[ClusterParameterGroupStatus]
  type ClusterParameterStatusList = js.Array[ClusterParameterStatus]
  type ClusterSecurityGroupMembershipList = js.Array[ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList = js.Array[String]
  type ClusterSecurityGroups = js.Array[ClusterSecurityGroup]
  type ClusterSubnetGroups = js.Array[ClusterSubnetGroup]
  type ClusterVersionList = js.Array[ClusterVersion]
  type DbGroupList = js.Array[String]
  type DeferredMaintenanceWindowsList = js.Array[DeferredMaintenanceWindow]
  type DeleteClusterSnapshotMessageList = js.Array[DeleteClusterSnapshotMessage]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EligibleTracksToUpdateList = js.Array[UpdateTarget]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventInfoMapList = js.Array[EventInfoMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type HsmClientCertificateList = js.Array[HsmClientCertificate]
  type HsmConfigurationList = js.Array[HsmConfiguration]
  type IPRangeList = js.Array[IPRange]
  type IamRoleArnList = js.Array[String]
  type ImportTablesCompleted = js.Array[String]
  type ImportTablesInProgress = js.Array[String]
  type ImportTablesNotStarted = js.Array[String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type Long = scala.Double
  type LongOptional = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.standard__
    - typings.awsDashSdk.awsDashSdkStrings.`high-performance`
    - java.lang.String
  */
  type Mode = _Mode | java.lang.String
  type NodeConfigurationOptionList = js.Array[NodeConfigurationOption]
  type NodeConfigurationOptionsFilterList = js.Array[NodeConfigurationOptionsFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NodeType
    - typings.awsDashSdk.awsDashSdkStrings.NumberOfNodes
    - typings.awsDashSdk.awsDashSdkStrings.EstimatedDiskUtilizationPercent
    - typings.awsDashSdk.awsDashSdkStrings.Mode
    - java.lang.String
  */
  type NodeConfigurationOptionsFilterName = _NodeConfigurationOptionsFilterName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.eq_
    - typings.awsDashSdk.awsDashSdkStrings.lt_
    - typings.awsDashSdk.awsDashSdkStrings.gt_
    - typings.awsDashSdk.awsDashSdkStrings.le_
    - typings.awsDashSdk.awsDashSdkStrings.ge_
    - typings.awsDashSdk.awsDashSdkStrings.in__
    - typings.awsDashSdk.awsDashSdkStrings.between_
    - java.lang.String
  */
  type OperatorType = _OperatorType | java.lang.String
  type OrderableClusterOptionsList = js.Array[OrderableClusterOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.static__
    - typings.awsDashSdk.awsDashSdkStrings.dynamic__
    - java.lang.String
  */
  type ParameterApplyType = _ParameterApplyType | java.lang.String
  type ParameterGroupList = js.Array[ClusterParameterGroup]
  type ParametersList = js.Array[Parameter]
  type PendingActionsList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedNodeList = js.Array[ReservedNode]
  type ReservedNodeOfferingList = js.Array[ReservedNodeOffering]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Regular_
    - typings.awsDashSdk.awsDashSdkStrings.Upgradable
    - java.lang.String
  */
  type ReservedNodeOfferingType = _ReservedNodeOfferingType | java.lang.String
  type RestorableNodeTypeList = js.Array[String]
  type RevisionTargetsList = js.Array[RevisionTarget]
  type ScheduleDefinitionList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MODIFYING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ScheduleState = _ScheduleState | java.lang.String
  type ScheduledActionFilterList = js.Array[ScheduledActionFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`cluster-identifier`
    - typings.awsDashSdk.awsDashSdkStrings.`iam-role`
    - java.lang.String
  */
  type ScheduledActionFilterName = _ScheduledActionFilterName | java.lang.String
  type ScheduledActionList = js.Array[ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type ScheduledActionState = _ScheduledActionState | java.lang.String
  type ScheduledActionTimeList = js.Array[js.Date]
  type ScheduledActionTypeValues = ResizeCluster | java.lang.String
  type ScheduledSnapshotTimeList = js.Array[js.Date]
  type SensitiveString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.TOTAL_SIZE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_TIME
    - java.lang.String
  */
  type SnapshotAttributeToSortBy = _SnapshotAttributeToSortBy | java.lang.String
  type SnapshotCopyGrantList = js.Array[SnapshotCopyGrant]
  type SnapshotIdentifierList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotScheduleList = js.Array[SnapshotSchedule]
  type SnapshotSortingEntityList = js.Array[SnapshotSortingEntity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASC
    - typings.awsDashSdk.awsDashSdkStrings.DESC
    - java.lang.String
  */
  type SortByOrder = _SortByOrder | java.lang.String
  type SourceIdsList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.cluster_
    - typings.awsDashSdk.awsDashSdkStrings.`cluster-parameter-group`
    - typings.awsDashSdk.awsDashSdkStrings.`cluster-security-group`
    - typings.awsDashSdk.awsDashSdkStrings.`cluster-snapshot`
    - typings.awsDashSdk.awsDashSdkStrings.`scheduled-action`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedOperationList = js.Array[SupportedOperation]
  type SupportedPlatformsList = js.Array[SupportedPlatform]
  type TStamp = js.Date
  type TableRestoreStatusList = js.Array[TableRestoreStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - java.lang.String
  */
  type TableRestoreStatusType = _TableRestoreStatusType | java.lang.String
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  type TagValueList = js.Array[String]
  type TaggedResourceList = js.Array[TaggedResource]
  type TrackList = js.Array[MaintenanceTrack]
  type ValueStringList = js.Array[String]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-12-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
