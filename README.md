coursework-group-15 created by GitHub Classroom

# SimpMusic to Sonic Pi

SimpMusic is a DSML designed for generating code used in [Sonic Pi](https://sonic-pi.net/) to make music.

## Rule

The rules are refined in the file `/uk.ac.kcl.inf.simpmusic/src/uk/ac/kcl/inf/SimpMusic.xtext`.

### Start rule:

**SimpleMusic**:\
&nbsp;&nbsp;&nbsp;&nbsp;notes += Note*\
;

### Other rules:

**Note**:\
&nbsp;&nbsp;&nbsp;&nbsp;Solfege |\
&nbsp;&nbsp;&nbsp;&nbsp;Sleep |\
&nbsp;&nbsp;&nbsp;&nbsp;SolfegeWithModification |\
&nbsp;&nbsp;&nbsp;&nbsp;LoopNote\
;
    
There are four different types of notes: **Solfege**, **Rest**, **SolfegeWithModification** and **LoopNote**.
    
1. **Solfege**:\
&nbsp;&nbsp;&nbsp;&nbsp;note = Solfa\
;
    
    enum Solfa:\
&nbsp;&nbsp;&nbsp;&nbsp;Do | Re | Mi | Fa | Sol | La | Si\
;
    
    **Solfege** can only be **Do**, **Re**, **Mi**, **Fa**, **Sol**, **La** and **Si** which corresponds to **C**, **D**, **E**, **F**, **G**, **A** and **B**. In code generation, each Solfege generate a corresponded Solfa with a 0.5 second sleep.
    
    [Code generation]
    
    >Do
   
    generates
            
    >play :C\
    >sleep 0.5
    
2. **Sleep**:\
&nbsp;&nbsp;&nbsp;&nbsp;note = "-"\
;
    
    **Sleep** allows the user to stop the music for 0.5 seconds. It can be used to generate a rest note.
    
    [Code generation]
    
    >\-
    
    generates
            
    >sleep 0.5
    
3. **SolfegeWithModification**:\
&nbsp;&nbsp;&nbsp;&nbsp;note = Solfege "(" mods += Modification+ ")"\
;

    **Modification**:\
&nbsp;&nbsp;&nbsp;&nbsp;Amplitude | Timbre | Tone\
;
    
    The rule **SolfegeWithModification** provides 4 types of modifications to **Solfege** which are **Amplitude**, **Timbre** and **Tone**.
    
    <br />
    
    **Amplitude**:\
&nbsp;&nbsp;&nbsp;&nbsp;amp = AmpType\
;
    
    enum **AmpType**:\
&nbsp;&nbsp;&nbsp;&nbsp;weak = ">" |\
&nbsp;&nbsp;&nbsp;&nbsp;strong = "<"\
;
    
    **Amplitude** provides strong and weak amplitude modification. The syntax **>** and **<** are corresponding to **amp:1.5** and **amp:0.5**.
    
    [Code generation]
    
    >Do(>)
    
    generates
            
    >play :C, amp: 0.5\
    >sleep 0.5
    
    <br />

    **Timbre**:\
&nbsp;&nbsp;&nbsp;&nbsp;timbre = TimbreType\
;
    
    enum **TimbreType**:\
&nbsp;&nbsp;&nbsp;&nbsp;sharp |\
&nbsp;&nbsp;&nbsp;&nbsp;flat\
;
    
    **Timbre** provides flat and sharp accidental modification. The syntax **flat** and **sharp** are corresponding to **b** and **s**.
    
    [Code generation]
    
    >Do(flat)
    
    generates
            
    >play :Cb\
    >sleep 0.5
    
    <br />
    
    **Tone**:\
&nbsp;&nbsp;&nbsp;&nbsp;tone=ToneType(val = INT)\
;
    
    enum **ToneType**:\
&nbsp;&nbsp;&nbsp;&nbsp;high = "+" |\
&nbsp;&nbsp;&nbsp;&nbsp;sub = "-"\
;
    
    **Tone** provides different degree modification. Adding/Subtracting one number represent one octave (basic value is 4).
    
    [Code generation]
    
    >Do(+1)
    
    generates
            
    >play :C5\
    >sleep 0.5
    
4. **LoopNote**:\
&nbsp;&nbsp;&nbsp;&nbsp;count = INT "times" "do"\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;notes += Note*\
&nbsp;&nbsp;&nbsp;&nbsp;"end"\
;
    
    **LoopNote** provides repeating function.
    
    [Code generation]
    
    >2 times do\
    >&nbsp;&nbsp;&nbsp;&nbsp;Do\
    >end
    
    generates
            
    >2.times do\
    >&nbsp;&nbsp;&nbsp;&nbsp;play :C\
    >&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
    >end
    

## Example

- input:

>Sol Mi Mi(flat>+13) - Fa Re Re(-4flat<) -\
>2 times do\
>&nbsp;&nbsp;&nbsp;&nbsp;Do Re Mi Fa Sol Sol Sol(>+3sharp) -\
>end

- output:

>play :G\
>sleep 0.5\
>play :E\
>sleep 0.5\
>play :Eb17, amp: 0.5\
>sleep 0.5\
>sleep 0.5\
>play :F\
>sleep 0.5\
>play :D\
>sleep 0.5\
>play :Db0, amp: 1.5\
>sleep 0.5\
>sleep 0.5\
>2.times do\
>&nbsp;&nbsp;&nbsp;&nbsp;play :C\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;play :D\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;play :E\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;play :F\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;play :G\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;play :G\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;play :Gs7, amp: 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>&nbsp;&nbsp;&nbsp;&nbsp;sleep 0.5\
>end
