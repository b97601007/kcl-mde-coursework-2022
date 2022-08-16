/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.kcl.inf.simpMusic.AmpType;
import uk.ac.kcl.inf.simpMusic.Amplitude;
import uk.ac.kcl.inf.simpMusic.LoopNote;
import uk.ac.kcl.inf.simpMusic.Modification;
import uk.ac.kcl.inf.simpMusic.Note;
import uk.ac.kcl.inf.simpMusic.SimpleMusic;
import uk.ac.kcl.inf.simpMusic.Sleep;
import uk.ac.kcl.inf.simpMusic.Solfa;
import uk.ac.kcl.inf.simpMusic.Solfege;
import uk.ac.kcl.inf.simpMusic.SolfegeWithModification;
import uk.ac.kcl.inf.simpMusic.Timbre;
import uk.ac.kcl.inf.simpMusic.TimbreType;
import uk.ac.kcl.inf.simpMusic.Tone;
import uk.ac.kcl.inf.simpMusic.ToneType;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SimpMusicGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final SimpleMusic model = ((SimpleMusic) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), this.generate(model));
  }
  
  public String deriveTargetFileNameFor(final SimpleMusic music, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
  
  public CharSequence generate(final SimpleMusic music) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<Note, String> _function = (Note it) -> {
      return this.generateNote(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<Note, String>map(music.getNotes(), _function), "\n");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String _generateNote(final Note note) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateNote(final Solfege note) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicNote = this.getBasicNote(note.getNote());
    _builder.append(_basicNote);
    String _plus = (_builder.toString() + "\n");
    return (_plus + "sleep 0.5");
  }
  
  public CharSequence getBasicNote(final Solfa solfa) {
    StringConcatenation _builder = new StringConcatenation();
    String _switchResult = null;
    if (solfa != null) {
      switch (solfa) {
        case DO:
          _switchResult = "play :C";
          break;
        case RE:
          _switchResult = "play :D";
          break;
        case MI:
          _switchResult = "play :E";
          break;
        case FA:
          _switchResult = "play :F";
          break;
        case SOL:
          _switchResult = "play :G";
          break;
        case LA:
          _switchResult = "play :A";
          break;
        case SI:
          _switchResult = "play :B";
          break;
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    _builder.append(_switchResult);
    return _builder;
  }
  
  protected String _generateNote(final Sleep note) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sleep 0.5");
    return _builder.toString();
  }
  
  protected String _generateNote(final SolfegeWithModification note) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _basicNote = this.getBasicNote(note.getNote().getNote());
      _builder.append(_basicNote);
      final String basicNote = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      final Function1<Modification, String> _function = (Modification it) -> {
        return this.generateModification(it);
      };
      String _join = IterableExtensions.join(ListExtensions.<Modification, String>map(note.getMods(), _function), "");
      _builder_1.append(_join);
      String mod = _builder_1.toString();
      if ((mod.contains(", amp: 0.5") || mod.contains(", amp: 1.5"))) {
        String _xifexpression = null;
        boolean _contains = mod.contains(", amp: 0.5");
        if (_contains) {
          _xifexpression = ", amp: 0.5";
        } else {
          _xifexpression = ", amp: 1.5";
        }
        final String type = _xifexpression;
        mod = mod.replaceFirst(", amp: [0-9][.][0-9]", "");
        String _mod = mod;
        mod = (_mod + type);
      }
      if ((mod.contains("[[s]]") || mod.contains("[[b]]"))) {
        int _indexOf = mod.indexOf("[[");
        int _plus = (_indexOf + 2);
        final String timbre = mod.substring(_plus, mod.indexOf("]]"));
        mod = mod.replaceFirst("\\[\\[(s|b)\\]\\]", "");
        mod = (timbre + mod);
      }
      _xblockexpression = (((basicNote + mod) + "\n") + "sleep 0.5");
    }
    return _xblockexpression;
  }
  
  protected String _generateNote(final LoopNote note) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _count = note.getCount();
      boolean _greaterThan = (_count > 0);
      if (_greaterThan) {
        int _count_1 = note.getCount();
        _builder.append(_count_1);
        _builder.append(".times do");
        _builder.newLineIfNotEmpty();
        {
          EList<Note> _notes = note.getNotes();
          for(final Note stm : _notes) {
            _builder.append("\t");
            String _generateNote = this.generateNote(stm);
            _builder.append(_generateNote, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("end");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateModification(final Amplitude mod) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", amp: ");
    {
      AmpType _amp = mod.getAmp();
      boolean _tripleEquals = (_amp == AmpType.WEAK);
      if (_tripleEquals) {
        _builder.append("0.5");
      } else {
        _builder.append("1.5");
      }
    }
    return _builder.toString();
  }
  
  protected String _generateModification(final Timbre mod) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TimbreType _timbre = mod.getTimbre();
      boolean _tripleEquals = (_timbre == TimbreType.SHARP);
      if (_tripleEquals) {
        _builder.append("[[s]]");
      } else {
        _builder.append("[[b]]");
      }
    }
    return _builder.toString();
  }
  
  protected String _generateModification(final Tone mod) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ToneType _tone = mod.getTone();
      boolean _tripleEquals = (_tone == ToneType.HIGH);
      if (_tripleEquals) {
        int _val = mod.getVal();
        int _plus = (4 + _val);
        _builder.append(_plus);
      } else {
        int _val_1 = mod.getVal();
        int _minus = (4 - _val_1);
        _builder.append(_minus);
      }
    }
    return _builder.toString();
  }
  
  public String generateNote(final Note note) {
    if (note instanceof LoopNote) {
      return _generateNote((LoopNote)note);
    } else if (note instanceof Sleep) {
      return _generateNote((Sleep)note);
    } else if (note instanceof Solfege) {
      return _generateNote((Solfege)note);
    } else if (note instanceof SolfegeWithModification) {
      return _generateNote((SolfegeWithModification)note);
    } else if (note != null) {
      return _generateNote(note);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(note).toString());
    }
  }
  
  public String generateModification(final Modification mod) {
    if (mod instanceof Amplitude) {
      return _generateModification((Amplitude)mod);
    } else if (mod instanceof Timbre) {
      return _generateModification((Timbre)mod);
    } else if (mod instanceof Tone) {
      return _generateModification((Tone)mod);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mod).toString());
    }
  }
}
