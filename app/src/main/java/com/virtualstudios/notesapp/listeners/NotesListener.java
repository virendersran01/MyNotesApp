package com.virtualstudios.notesapp.listeners;

import com.virtualstudios.notesapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
