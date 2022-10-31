package com.dicoding.mystudentdata.database

import android.content.Context
import androidx.room.*
import androidx.room.migration.AutoMigrationSpec

@Database(
    entities = [Student::class, University::class, Course::class, CourseStudentCrossRef::class],
    version = 2,
    autoMigrations = [
        AutoMigration(from = 1, to = 2, spec = StudentDatabase.MyAutoMigration::class)
    ],
    exportSchema = true
)
abstract class StudentDatabase : RoomDatabase() {

    abstract fun studentDao(): StudentDao

    @RenameColumn(tableName = "University", fromColumnName = "name", toColumnName = "universityName")
    class MyAutoMigration : AutoMigrationSpec

    companion object {
        @Volatile
        private var INSTANCE: StudentDatabase? = null

        @JvmStatic
        fun getDatabase(context: Context): StudentDatabase {
            if (INSTANCE == null) {
                synchronized(StudentDatabase::class.java) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            StudentDatabase::class.java, "student_database")
                        .fallbackToDestructiveMigration()
                        .createFromAsset("student_database.db")
                        .build()
                }
            }
            return INSTANCE as StudentDatabase
        }

    }
}