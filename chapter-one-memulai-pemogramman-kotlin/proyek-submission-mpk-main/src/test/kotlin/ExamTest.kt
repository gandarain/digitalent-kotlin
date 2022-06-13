import com.dicoding.exam.latihan1.isEvenNumber
import com.dicoding.exam.latihan2.calculate
import com.dicoding.exam.latihan2.result
import com.dicoding.exam.latihan3.checkType
import com.dicoding.exam.latihan4.vehicle
import com.dicoding.exam.latihan5.multiple
import com.dicoding.exam.latihan5.sum
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.system.measureTimeMillis

/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam kelas Test                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

class ExamTest : Spek({
    group("All exam test") {
        describe("Exam 1 will be check all about control flow") {
            it("[Latihan 1] - 2 is odd number") {
                assertTrue(isEvenNumber(2))
            }

            it("[Latihan 1] - 6 is odd number") {
                assertTrue(isEvenNumber(6))
            }

            it("[Latihan 1] - 7 is not odd number") {
                assertFalse(isEvenNumber(7))
            }

            it("[Latihan 1] - 1 is not odd number") {
                assertFalse(isEvenNumber(1))
            }

            it("[Latihan 1] - result function sould be return expected value") {
                val expect = com.dicoding.exam.latihan1.result(20)
                assertEquals(expect, 600)
            }
        }

        describe("Exam 2 will be check all about Fundamental") {
            it("[Latihan 2] - calculate result should be return 54") {
                val result = calculate(101, 52, 99)
                assertEquals(result, 54)
            }

            it("[Latihan 2] - calculate result should be return 103") {
                val result = calculate(101, 52, null)
                assertEquals(result, 103)
            }

            it("[Latihan 2] - result function should be return expected value") {
                val calculateResult = calculate(101, 52, null)
                val result = result(calculateResult)
                assertEquals(result, "Result is 103")
            }
        }

        describe("Exam 3 will be check about Generics") {
            it("[Latihan 3] - checkType should be return Int when passing param is `50`") {
                val result = checkType(50)
                assertEquals("Yes! it's Integer", result)
            }

            it("[Latihan 3] - checkType should be return String when passing param is `Dicoding Indonesia`") {
                val result = checkType("Dicoding Indonesia")
                assertEquals("Yes! it's String", result)
            }

            it("[Latihan 3] - checkType should be return Double when passing param is `1.0`") {
                val result = checkType(1.0)
                assertEquals("Yes! it's Double", result)
            }

            it("[Latihan 3] - checkType should be return List when passing param is `listOf<Any>`") {
                val result = checkType(listOf<Any>())
                assertEquals("Yes! it's List", result)
            }

            it("[Latihan 3] - checkType should be return Map when passing param is `mapOf<Any, Any>`") {
                val result = checkType(mapOf<Any, Any>())
                assertEquals("Yes! it's Map", result)
            }
        }

        describe("Exam 4 will be check about Collections") {
            it("[Latihan 4] - vehicle function should be return Map") {
                val vehicle = vehicle()
                assertTrue(vehicle is Map)
            }

            it("[Latihan 4] - type should be motorcycle") {
                val vehicle: Map<String, String> = vehicle()
                assertTrue(vehicle["type"] != null)
                assertTrue(vehicle["type"] == "motorcycle")
            }

            it("[Latihan 4] - maxSpeed should be 230Km/s") {
                val vehicle: Map<String, String> = vehicle()
                assertTrue(vehicle["maxSpeed"] != null)
                assertTrue(vehicle["maxSpeed"] == "230Km/s")
            }

            it("[Latihan 4] - maxTank should be 100Ltr") {
                val vehicle: Map<String, String> = vehicle()
                assertTrue(vehicle["maxTank"] != null)
                assertTrue(vehicle["maxTank"] == "100Ltr")
            }
        }

        describe("Exam 5 will be check about Coroutines") {
            it("[Latihan 5] - execution time of sum function should be more than 3s") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        sum(10, 10)
                    }

                    assertTrue(executionTime in 3001..3499)
                }
            }

            it("[Latihan 5] - sum function should be return 10 if valueA is 5 and valueB is 5") {
                runBlocking {
                    val result = async { sum(5, 5) }
                    assertTrue(result.await() == 10)
                }
            }

            it("[Latihan 5] - sum function should be return 107 if valueA is 100 and valueB is 7") {
                runBlocking {
                    val result = async { sum(100, 7) }
                    assertTrue(result.await() == 107)
                }
            }

            it("[Latihan 5] - execution time of multiple function should be more than 2s") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        multiple(10, 10)
                    }

                    assertTrue(executionTime in 2001..2499)
                }
            }

            it("[Latihan 5] - multiple function should be return 36 if valueA is 6 and valueB is 6") {
                runBlocking {
                    val result = async { multiple(6, 6) }
                    assertTrue(result.await() == 36)
                }
            }

            it("[Latihan 5] - multiple function should be return 25 if valueA is 5 and valueB is 5") {
                runBlocking {
                    val result = async { multiple(5, 5) }
                    assertTrue(result.await() == 25)
                }
            }
        }
    }
})