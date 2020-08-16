/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.parthdesai1208.motionlayout.data


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.parthdesai1208.motionlayout.R


enum class OnBoardingPage(@StringRes val titleResource: Int,
                          @StringRes val descriptionResource: Int,
                          @DrawableRes val logoResource: Int) {

  ANDROID(R.string.android_title, R.string.android_description, R.drawable.android_logo),
  IOS(R.string.ios_title, R.string.ios_description, R.drawable.ios_swift_logo),
  UNITY(R.string.unity_title, R.string.unity_description, R.drawable.unity_logo),
  KOTLIN(R.string.kotlin_title, R.string.kotlin_description, R.drawable.kotlin_logo),
  SWIFT(R.string.swift_title, R.string.swift_description, R.drawable.ios_swift_logo)
}