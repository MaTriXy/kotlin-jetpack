// Code generated by ./jetpack-extensions-bundles/generate.sh
package com.github.vmironov.jetpack.intents

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable

import java.io.Serializable

public fun Intent.putExtraOrIgnore(key: String, value: Boolean?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getBooleanExtraOrNull(key: String): Boolean? {
  return if (hasExtra(key)) {
    getBooleanExtra(key, false)
  } else {
    null
  }
}

public fun Intent.getBooleanExtraOrDefault(key: String, value: Boolean): Boolean {
  return getBooleanExtraOrNull(key) ?: value
}

public fun Intent.getBooleanExtraOrThrow(key: String): Boolean {
  return getBooleanExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Double?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getDoubleExtraOrNull(key: String): Double? {
  return if (hasExtra(key)) {
    getDoubleExtra(key, 0.0)
  } else {
    null
  }
}

public fun Intent.getDoubleExtraOrDefault(key: String, value: Double): Double {
  return getDoubleExtraOrNull(key) ?: value
}

public fun Intent.getDoubleExtraOrThrow(key: String): Double {
  return getDoubleExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Int?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getIntExtraOrNull(key: String): Int? {
  return if (hasExtra(key)) {
    getIntExtra(key, 0)
  } else {
    null
  }
}

public fun Intent.getIntExtraOrDefault(key: String, value: Int): Int {
  return getIntExtraOrNull(key) ?: value
}

public fun Intent.getIntExtraOrThrow(key: String): Int {
  return getIntExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Long?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getLongExtraOrNull(key: String): Long? {
  return if (hasExtra(key)) {
    getLongExtra(key, 0L)
  } else {
    null
  }
}

public fun Intent.getLongExtraOrDefault(key: String, value: Long): Long {
  return getLongExtraOrNull(key) ?: value
}

public fun Intent.getLongExtraOrThrow(key: String): Long {
  return getLongExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: String?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getStringExtraOrNull(key: String): String? {
  return if (hasExtra(key)) {
    getStringExtra(key)
  } else {
    null
  }
}

public fun Intent.getStringExtraOrDefault(key: String, value: String): String {
  return getStringExtraOrNull(key) ?: value
}

public fun Intent.getStringExtraOrThrow(key: String): String {
  return getStringExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Bundle?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getBundleExtraOrNull(key: String): Bundle? {
  return if (hasExtra(key)) {
    getBundleExtra(key)
  } else {
    null
  }
}

public fun Intent.getBundleExtraOrDefault(key: String, value: Bundle): Bundle {
  return getBundleExtraOrNull(key) ?: value
}

public fun Intent.getBundleExtraOrThrow(key: String): Bundle {
  return getBundleExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Byte?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getByteExtraOrNull(key: String): Byte? {
  return if (hasExtra(key)) {
    getByteExtra(key, 0)
  } else {
    null
  }
}

public fun Intent.getByteExtraOrDefault(key: String, value: Byte): Byte {
  return getByteExtraOrNull(key) ?: value
}

public fun Intent.getByteExtraOrThrow(key: String): Byte {
  return getByteExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Char?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getCharExtraOrNull(key: String): Char? {
  return if (hasExtra(key)) {
    getCharExtra(key, '0')
  } else {
    null
  }
}

public fun Intent.getCharExtraOrDefault(key: String, value: Char): Char {
  return getCharExtraOrNull(key) ?: value
}

public fun Intent.getCharExtraOrThrow(key: String): Char {
  return getCharExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Float?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getFloatExtraOrNull(key: String): Float? {
  return if (hasExtra(key)) {
    getFloatExtra(key, 0.0f)
  } else {
    null
  }
}

public fun Intent.getFloatExtraOrDefault(key: String, value: Float): Float {
  return getFloatExtraOrNull(key) ?: value
}

public fun Intent.getFloatExtraOrThrow(key: String): Float {
  return getFloatExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Parcelable?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getParcelableExtraOrNull(key: String): Parcelable? {
  return if (hasExtra(key)) {
    getParcelableExtra(key)
  } else {
    null
  }
}

public fun Intent.getParcelableExtraOrDefault(key: String, value: Parcelable): Parcelable {
  return getParcelableExtraOrNull(key) ?: value
}

public fun Intent.getParcelableExtraOrThrow(key: String): Parcelable {
  return getParcelableExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Serializable?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getSerializableExtraOrNull(key: String): Serializable? {
  return if (hasExtra(key)) {
    getSerializableExtra(key)
  } else {
    null
  }
}

public fun Intent.getSerializableExtraOrDefault(key: String, value: Serializable): Serializable {
  return getSerializableExtraOrNull(key) ?: value
}

public fun Intent.getSerializableExtraOrThrow(key: String): Serializable {
  return getSerializableExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

public fun Intent.putExtraOrIgnore(key: String, value: Short?): Unit {
  if (value != null) {
    putExtra(key, value)
  }
}

public fun Intent.getShortExtraOrNull(key: String): Short? {
  return if (hasExtra(key)) {
    getShortExtra(key, 0)
  } else {
    null
  }
}

public fun Intent.getShortExtraOrDefault(key: String, value: Short): Short {
  return getShortExtraOrNull(key) ?: value
}

public fun Intent.getShortExtraOrThrow(key: String): Short {
  return getShortExtraOrNull(key) ?: throw IllegalStateException("Key $key is missed")
}

