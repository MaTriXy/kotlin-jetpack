TARGET="./src/main/kotlin/com/github/vmironov/bender/IntentExtensions.kt"

rm $TARGET
touch $TARGET

println() {
  echo "$1" >> $TARGET
}

import() {
  println "import $1"
}

putOrIgnore() {
  println "public fun Intent.put${1}OrIgnore(key: String, value: ${2}?): Unit {"
  println "  if (value != null) {"
  println "    putExtra(key, value)"
  println "  }"
  println "}"
  println ""
}

getOrNull() {
  println "public fun Intent.get${1}OrNull(key: String): ${2}? {"
  println "  return if (hasExtra(key)) {"
  if [ -z "$3" ]; then
    println "    get${1}Extra(key)"
  else
    println "    get${1}Extra(key, ${3})"
  fi
  println "  } else {"
  println "    null"
  println "  }"
  println "}"
  println ""
}

getOrThrow() {
  println "public fun Intent.get${1}OrThrow(key: String): ${2} {"
  println "  return get${1}OrNull(key) ?: throw IllegalStateException(\"Key \${key} is missed\")"
  println "}"
  println ""
}

getOrDefault() {
  println "public fun Intent.get${1}OrDefault(key: String, value: ${2}): ${2} {"
  println "  return get${1}OrNull(key) ?: value"
  println "}"
  println ""
}

generate() {
  putOrIgnore $1 $2 $3
  getOrNull $1 $2 $3
  getOrDefault $1 $2 $3
  getOrThrow $1 $2 $3
}

println "// Code generated by ./scripts/generate-intent-extensions.sh"
println "package com.github.vmironov.bender"
println

import "android.content.Intent"
import "android.os.Bundle"
import "android.os.IBinder"
import "android.os.Parcelable"
println

import "java.util.ArrayList"
import "java.io.Serializable"
println

generate "Boolean" "Boolean" "false"
generate "BooleanArray" "BooleanArray"
generate "Double" "Double" "0.0"
generate "DoubleArray" "DoubleArray"
generate "Int" "Int" "0"
generate "IntArray" "IntArray"
generate "Long" "Long" "0L"
generate "LongArray" "LongArray"
generate "String" "String"
generate "StringArray" "Array<String>"
generate "Bundle" "Bundle"
generate "Byte" "Byte" "0"
generate "ByteArray" "ByteArray"
generate "Char" "Char" "'0'"
generate "CharArray" "CharArray"
generate "CharSequence" "CharSequence"
generate "CharSequenceArrayList" "ArrayList<CharSequence>"
generate "Float" "Float" "0.0f"
generate "FloatArray" "FloatArray"
generate "IntegerArrayList" "ArrayList<Int>"
generate "Parcelable" "Parcelable"
generate "ParcelableArray" "Array<Parcelable>"
generate "ParcelableArrayList" "ArrayList<Parcelable>"
generate "Serializable" "Serializable"
generate "Short" "Short" "0"
generate "ShortArray" "ShortArray"
