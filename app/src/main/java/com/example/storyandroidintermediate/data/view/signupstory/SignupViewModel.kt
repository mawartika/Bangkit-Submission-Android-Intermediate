package com.example.storyandroidintermediate.data.view.signupstory

import androidx.lifecycle.ViewModel
import com.example.storyandroidintermediate.data.story.StoryRepository

class SignupViewModel (private val repository: StoryRepository): ViewModel() {

    fun register(name: String, email: String, password: String) = repository.signup(name, email, password)
}