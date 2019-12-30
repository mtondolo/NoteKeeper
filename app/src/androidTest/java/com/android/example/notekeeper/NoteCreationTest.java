package com.android.example.notekeeper;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class NoteCreationTest {

    @Rule
    public ActivityTestRule<NoteListActivity> mNoteListActivityActivityTestRule =
            new ActivityTestRule<>(NoteListActivity.class);

    @Test
    public void createNewNote() {

    }

}