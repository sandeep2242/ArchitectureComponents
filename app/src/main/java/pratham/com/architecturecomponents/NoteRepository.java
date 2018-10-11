package pratham.com.architecturecomponents;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class NoteRepository {

    private NoteDAO noteDAO;
    private LiveData<List<Note>> allNotes;

    public NoteRepository() {
    }
}
