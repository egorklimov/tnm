package util

import org.eclipse.jgit.internal.storage.file.FileRepository

object ProjectConfig {
    private const val URI = "https://github.com/facebook/react.git"
    private const val REPO_DIR = "./local_repository/"
    const val RESOURCES_PATH = "./resources"
    const val numThreads = 4

    // UserMapper
    const val USER_ID = "userToId"
    const val ID_USER = "idToUser"

    // FileMapper
    const val FILE_ID = "fileToId"
    const val ID_FILE = "idToFile"

    // CommitMapper
    const val COMMIT_ID = "commitToId"
    const val ID_COMMIT = "idToCommit"

    // PageRankMiner
    const val COMMITS_GRAPH = "commitsGraph"
    const val CONCURRENT_GRAPH = "concurrentGraph"

    // FilesOwnershipMiner
    const val FILES_OWNERSHIP = "filesOwnership"
    const val POTENTIAL_OWNERSHIP = "potentialAuthorship"
    const val DEVELOPER_KNOWLEDGE = "developerKnowledge"

    // FileDependencyMatrixMiner
    const val FILE_DEPENDENCY = "fileDependencyMatrix"

    // ChangedFilesMiner
    const val USER_FILES_IDS = "userFilesIds"

    // AssignmentMatrixMiner
    const val ASSIGNMENT_MATRIX = "assignmentMatrix"

    // WorkTimeMiner
    const val WORKTIME_DISTRIBUTION = "WorkTime"

    // CNMatrix
    const val CN_MATRIX = "CN"

    // PageRank result
    const val PAGERANK_MATRIX = "PrageRank"

    // MirrorCongruence
    const val MIRROR_CONGRUENCE = "mirrorCongruence"

    val REPOSITORY = FileRepository("${REPO_DIR}/.git")
    val neededBranches = setOf("origin/master")
}