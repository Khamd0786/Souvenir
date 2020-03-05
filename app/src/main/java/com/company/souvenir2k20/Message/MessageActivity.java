package com.company.souvenir2k20.Message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.company.souvenir2k20.R;

public class MessageActivity extends AppCompatActivity {


    private final String[] messageName = {
            "Prof. Prem Kumar Kalra",
            "Mr. Arun Kumar Yadav",
            "Mr. P.K GUPTA",
            "Mr. Y. K. GUPTA",
            "Prof. V. K. Sharma ",
            "Dr. Shailendra Singh",
            "Mr. Himanshu Vijay",
            "Mr. Aatrey Pandey",
            "Prof. Mukul Singh",
            "Prof. (Dr) K. J. Gohil",
            "Dr. Amit Sharma",
            "Mr. Atul Narang",
            "Mr. Anoop Kumar Sengar",
            "Dr. Vinay Singh",
            "Dr. R. P. Sinha",
            "Dr. R.K. Jain",
            "Mr. Jay Verdhan Nagayach",
            "Dr. Ravi Kant Pathak",
            "Mr. Dharm Singh",
            "Mr. MANISH GUPTA",
            "Mr. Tumul Saxena",
            "Ms. Sushmita Kumari",
            "Sudeep Pradhan",
            "Alumni Message",
            "Rohit Kumar Chand\n" + "Vikas Singh",
            "Mr. Sanjeev S. Thakur",
            "Dr. Sanjay Kulshrestha"



    };

    private final String[] messagePost = {
            "Chief Guest",
            "P.C.S City Magistrate, Agra",
            "Chairman-SGI",
            "Vice Chairman-SGI",
            "Executive Vice President",
            "Director AECTC",
            "Convener Cerebrum 2K20",
            "Convener Cerebrum 2K20",
            "     Dean\n" +
                    "Anand College of Architecture, Agra\n",
            " (DEAN)\n" +
                    " Anand College of Pharmacy, Agra\n",
            "Dean Academics\n" +
                    "Anand Engineering College\n" +
                    "Technical Campus, Agra\n",
            "Dean Student Welfare\n" +
                    "Anand Engineering College\n" +
                    "Technical Campus, Agra\n",
            "HOD\n" +
                    "Department of Chemical Engineering\n" +
                    "Anand engineering college , Agra\n",
            "Coordinator, Technical Event  Committee, Cerebrum 2020",
            "HOD,Mechanical Engineering",
            "HOD, Biotechnology",
            "HOD, Training & Placement",
            "HOD, MBA",
            "IFS (Rtd.)\n" +
                    "Registrar\n",
            "Dpt. Registrar Corporate Affairs, SGI",
            "Batch- 2015-2019, Chemical Engineering",
            "ENGINEER TRAINEE\n" +
                    "Motherson Sumi Infotech & Designs Limited\n" +
                    "C-26, Sector-62\n" +
                    "Noida - 201309, Uttar Pradesh\n" +
                    "India\n" +
                    "Proud to be part of Samvardhana Motherson\n",
            "Alumni",
            "Alumni\n" + "B.Tech (ME-2019)",
            "Organizing secretary",
            "Chief Editor",

            "Editor,\n" +
                    "Souvenir, Cerebrum-2020\n"

    };

    private final String[] messageHeading = {
            "It is really a great pleasure",
            "I am pleased to know that the students of Anand Engineering College",
            "\"WINNING ISN'T EVERYTHING, PARTICIPATING IS",
            "It gives me immense pleasure to know that our Anand Engineering College of Agra",
            "'Cerebrum', the techno-cultural fest of the Anand campus ",
            "MESSAGE FROM DIRECTOR’S DESK",
            "It is a matter of immense pleasure to conduct our Annual Techno Cultural - Fest“Cerebrum 2020",
            "It gives me immense pleasure to welcome all the dignitaries, friends & students of Anand college campus in CEREBRUM 2020",
            " It pleases me to extend my hearty greetings to the students",
            "Here is that time of the year again when campus becomes all the more vibrant, comes alive with lots of colorful festivities and joyous celebrations",
            "- \"A BIG LEAP\" ",
            "Cerebrum 2K20 brings in happiness, devotion, momentum, creativity, passion and success for all our students.",
            "I am pleased to learn that the Anand Engineering College Technical Campus is organizing its Annual-Techno-Cultural Fest \"Cerebrum 2K20\"",
            "Businesses today has moved out of their comfort zone to explore boundaries hitherto untouched",
            "It gives me immense pleasure that Anand Engineering College Technical Campus",
            "It's a matter of great pleasure for me to write a message for Cerebrum 2K20",
            "Once again Cerebrum 2020 the Techno-Cultural Annual Festival of Anand Engineering College Technical Campus is back with the usual fanfare",
            "I am proud of being the part of such a wonderful event dedicated to the causes of better Anandians",
            "Learning is not a process limited to colleges only, nor does if end with conclusion of one’s college career",
            "Souvenir is more than just a magazine where the potential, talents, achievements and visions of our college are reflected",
            "Anand Engineering college, a place where every year young minds are shaped into responsible and talented human beings",
            "Four years at Anand Engineering College has paved way for a remarkable journey ahead",
            "Achievements-applauds,opportunities-thoughts, this is what I gained from ANAND ENGINEERING COLLEGE (SGI)",
            "My college life has been a great journey for me",
            "It’s an honor to be appointed as the organizing secretary of cerebrum 2020",
            "With great pleasure,on behalf of the Souvenir Committee, I present this year’s Souvenir, on the occasion of annual techno-cultural fest ‘Cerebrum-2020’, of Anand Engineering College Technical Campus (AECTC).",
            "“Take care to get what you like or you’ll be forced to like what you get.”"


    };

    private final String[] messageDetail = {
            "It is really a great pleasure to know that Anand Engineering College celebrates its Cultural and Technical Festival—CEREBRUM-2K20 on 6th and 7th March. It is now an acknowledged statement that Anand Engineering College Technical Campus has been striving hard to foster a culture of empowerment, creativity, innovation and unconventional ideas for the last 21 years in the field of Education. This year also the College is celebrating its function on 6th and 7th March 2020 with its commitment to bring out a Souvenir on this occasion. Any kind of commitment for the cause of education especially towards continuous improvement, innovation in learning life skills and developing the dynamic personality of young men and women deserves a big salute.  \n" +
                    "The participation of many eminent thinkers, scientists, social-scientists, educationists, researchers and students on this academic occasion would have a meaningful impact on the participants and would also be a significant contribution towards the cause of education.  \n" +
                    "I take this occasion to accolade the organizers and express my heartfelt good wishes for the success of the Festival. \n",


            "I am pleased to know that the students of Anand Engineering College, Agra are organizing their Annual National Level Techno-Cultural Fest ‘CEREBRUM 2020’ on 6th & 7th March, 2020.\n" +
                    "These events offer a platform and opportunity for Science, Engineering and Management graduates to enhance and develop their cultural, leadership, technical and managerial skills. It offers an environment far interaction of best of brains and talents. It fosters a spirit of fraternity and congeniality among the students.\n" +
                    "I congratulate the institute for providing such an excellent exposure to students to enhance their personality and their overall development by enriching and rewarding experiences. I convey my best wishes to faculties staff, students and administration of Anand Engineering College for making the event a grand success with their diligent endeavor.\n" +
                    " With Best Wishes\n",



            "\"WINNING ISN'T EVERYTHING, PARTICIPATING IS\"\n" +
                    "I am delighted to hear that Anand Engineering College Technical Campus is going to hold its 20th Annual Fest CEREBRUM 2020 on 6th and 7th March, 2020. \n" +
                    "CEREBRUM is envisioned as one of the best Techno-Cultural Festival to explore the hidden talents and in the students standing on the threshold of becoming professionals. This is going to be a mega two-day Techno-Cultural Razzmatazz. The objective of the fest is to promote youth culture, expand the horizons of opportunities and to provide a platform for the honing of creativity and creative ideas.\n" +
                    "Each issue of our \"SOUVENIR\" is a milestone that marks our growth, unfolds our imagination and gives life to our thoughts and aspirations. As an academic institution, we all Anandians are focused on channelizing the energy of youngsters and acting as a beacon in an appropriate manner to strengthen their skills.\n" +
                    "I express my deep and sincere gratitude to the Anandian Family for their continuous support and guidance in whole journey of Anand Engineering College Technical Campus till now.\n" +
                    "May God lead the journey on the path of continuous progress of this family!\n" +
                    "                                        WITH BEST WISHES\n",

            "It gives me immense pleasure to know that our Anand Engineering College of Agra is not only encouraging students to excel academically but also motivating them to harness their creativity by providing them a platform to exhibit their talent through the annual college fest \"CEREBRUM-2k20\".The cerebrum is a much-awaited annual techno-fest. It's always a very proud moment in the life of the institution to celebrate such occasion at a grand level. This fest will inculcate students to show their academic and technical talent. this fest will extend every opportunity to its participants to sharpen their skills in technical education, model representation as well as will bless them with a chance to give physical shape for innovative and creative ideas .Each year this fest is celebrated with a new theme to certify its students with new hope, ideas, emotions and dedication. Like every year, this year the theme of the techno-fest is \"A BIG LEAP. I am greatly obliged and thankful to all the members, staff and teachers of the institution for their support and efforts in developing such grand fest. I wish great success for CEREBRUM-20 of Anand Engineering College. With best wishes.",

            "'Cerebrum', the techno-cultural fest of the Anand campus is an annual celebration, of the students, organized by the students, for the students. It's a platform where students showcase their talents in variety of Technical & cultural activities, learn & enjoy in the process, soaking in the spirit of great enthusiasm, participation and camaraderie. \n" +
                    "The spin off effect is inculcation of a spirit of bonhomie, fellow feeling & camaraderie amongst students of different disciplines and better bonding between those from 1st year through the senior year to 4th year. Participants from other schools and colleges, their teachers & parents through digital & social media will also get a glimpse of the all -round capabilities of our boys & girls and while this results in improving the brand of the college, it as well creates many lasting memories and achievements, which students cherish in later life too. \n" +
                    "My best wishes to the students and faculty of Anand Engineering College Technical Campus for carrying on this wonderful tradition of celebrating \"Cerebrum\" showcasing the talents of the students. \n",

            "In today’s world, education is the most important & powerful acquisition for those who want to have a successful future. Education not only gives us a platform to succeed, but also the knowledge of social conduct, strength, character and self-respect. Education can be gained not only by academics but also by participating in extracurricular activities, interactive learning and even through sports. AECTC is going to celebrate 21st Annual Techno-Cultural Fest, called CEREBRUM-2020 on 6th-7thMarch 2020. Therefore, let me encourageall my students to participate whole whole-heartedly in all the events of CERERUM2520. The Techno-Cultural Fest at AECTC is an integral part of all Anandians. Here, students display their hidden capabilities through participation in various event like, paper presentation, Drama, Singing, Dancing etc. Basically this event is ‘of the students’ ‘for the students’ and is ‘by the students’, which in-culcalates the Time Management, Creativity and Leadership qualities.\n" +
                    "\tOn the occasion of 21stCerebrum2K20, I welcome all the guests, participants from other prestigious Institutions & dignitaries for encouraging our students. I am sure, all the Anandians will cherish & enjoy the memory of Cerebrum2K20.\n",

                    "It is a matter of immense pleasure to conduct our Annual Techno Cultural - Fest“Cerebrum 2020” at AEC, Agra on 6th and 7th March, 2020.\n" +
                    "This festival is over all development of the students by providing them the opportunities to bring out their hidden talents in executing and working together with their innovative ideas.\n" +
                    "Various Technical events, Cultural events andFun events are being organized by utilizing the various resources available indoor  and outdoor  the campus.\n" +
                    "Various Committees are formed with proper coordination of faculties & students. I congratulate each one for putting their untiring efforts.\n" +
                    "I thank the Honorable Chairman AEC and Dr. Shailendra Singh for providing financial support & also thank all Deans for proper guidance & support, to make this event memorable.\n" +
                    "I wish a great success to Cerebrum 2020.\n",


            "It gives me immense pleasure to welcome all the dignitaries, friends & students of Anand college campus in CEREBRUM 2020 and I am sure that you all will feel honored to be part of this esteemed and joyful functions.\n" +
                    "CEREBRUM is not only a function for us but also, we are marching forward to enhance the quality of this Institution of Excellence.\n" +
                    "                 Our College is nurturing self-reliant and self-dependent human being to cope with the challenging world of tomorrow. We impart education to empower youth to create a space in society. The harmonious mix of the legacy of knowledge and spiritual ambience of our college inspire young minds to be empowered and morally upright. We enjoyed a reputation of excellence in academic scholarship and managing social relations and responsibilities with society. \n" +
                    "Once again, I welcome you all in this function and I am proud to be part of this with a spectacle of a fine blend of tradition and modernity.\n",


            " It pleases me to extend my hearty greetings to the students of Anand Engineering College Campus of for presenting yet another version of their annual cultural fest 'Cerebrum' so titled to indicate the intense activity in human body stimulated by the biochemical activities in the brain. This annual event energizes the students to showcase their talent through the mental and physical efforts through stage performances, Literary activities, Technical discussions/debates and display of their innovative and technical skills. \n" +
                    "It is heartening to know that ‘Cerebrum – 2020’ appears to be striving to seek to include more creative and competitive in the newer areas of sculpting and artistic presentation of technical ideas through photography and poster designing. \n" +
                    "I would suggest the students should engage themselves in such cultural and technical events throughout the academic year organized in smaller scale to capture opportunities and develop the organizing skills among more students\n" +
                    "I wish the students and the event ‘Cerebrum – 2020’ itself, a resounding success. \n",


            "\"Here is that time of the year again when campus becomes all the more vibrant, comes alive with lots of colorful festivities and joyous celebrations. The annual event 'Cerebrum'- 2020!! The Mega event of the campus where our students get to show their varied talents, we all enjoy the process & savour the moments.  The students of Anand College of Pharmacy are enthusiastic about this event, as always and will take part with equal alacrity. My heartiest wishes to all the coordinators and participants - faculties, staff & students of all colleges on campus. Cheer up and bring forth the right spirit!! Good Luck\".",


            "It is moment of immense pleasure for me to witness this year’s Cerebrum 2K20 at Anand Engineering College Technical Campus. The   Annual-Techno-Cultural Fest Cerebrum 2K20 with the theme - \"A BIG LEAP\" showcases the hidden talents of sports, dance, music, literature, elocution, painting, Arts, rangoli, etc. The annual festival is platform for the students to bring out the best among them as also to hone qualities like responsibility, leadership, teamwork, life skills to provide them the much needed confidence in the professional life awaiting them in the future. Cerebrum 2020 not only requires the patronage of the higher echelons of the SGI family but also immense teamwork and coordination among different committees headed by  the faculty members as well as the students secretaries and coordinators. \n" +
                    "As Dean (Academics) of Anand Engineering College of Technical Campus it provides me immense satisfaction to see that students have so much of talent to show and also to immerge as future responsible professional and citizen of the country. I am sure the Souvenir of Cerebrum 2K20 would be a magazine worth going through and worth spending time for.   I wish the organizers the very best for the success of Cerebrum 2020. \n",


            "Cerebrum 2K20 brings in happiness, devotion, momentum, creativity, passion and success for all our students. We are witnessing an intersection of great challenge and a great opportunity. We are diverse in our outlook and our approach, beholden not to any ideology but to a fierce desire to discover — and help implement — what works.\n" +
                    "This world, in which we live, is a very competitive one. . The most important aspect in achieving success in this competitive world is self-confidence. Our Cerebrum 2K20 enabled quite a lot of individuals to come forth and display their qualities in all the events. This year also marks our season producing more Paper presentation from different departments, Model, Poster presentations, Robotics race and Cultural performances providing our students exceptional opportunities to learn cohesiveness and team spirit. Students cherish the purpose and happenings in making of this annual fest. \n" +
                    "Our organizing team who worked supremely hard to make sure this techno-cultural fest served as an example of excellence for the future generations.\n" +
                    "OUR FEST often carries with itself several emotions that can only be felt once you completely unite yourself with work and it is that point of time that beautiful memories are made. \n" +
                    "It always seems impossible until it’s done.\n" +
                    "\n" +
                    "Apart from FEST, we are pleased that you are taking the time to learn more about our exciting academic offerings and the opportunities for professional and personal development. At the moment, far too many students lack \n" +
                    "access to a high-quality education; still others are unable to achieve their full potential.\n" +
                    "We want to encourage our students to EXCEL, STRETCH, ENGAGE and CHOOSE. The challenge encourages students to choose wisely and make decisions of which they, their families, and their institution can be proud of.\n" +
                    "I am confident in your ability to meet the challenge and we will do all we canto support you in doing so.\n" +
                    "We hope you will embrace\n" +
                    "\uF0A7\tEXCEL academically\n" +
                    "\uF0A7\tSTRETCH yourself and try something new\n" +
                    "\uF0A7\tENGAGE on campus and in the community\n" +
                    "\uF0A7\tCHOOSE to make decisions that will elevate you and your future\n" +
                    "As you CHOOSE your path, we don’t want high-risk behaviors to spoil your experience at AEC or to jeopardize the considerable investment you are about to make in your education.\n" +
                    "\n" +
                    "Together, we will learn to change.\n" +
                    "I extend my best wishes to all participants, invited delegates, speakers and hope that Cerebrum 2K20 would be a grand success. Looking forward to an extremely enriching experience in the august gathering of academicians, students ……………….\n" +
                    "College is an amazing time of life—I hope you will make the most of it!\n" +
                    "I want to convey my best wishes to all the final year students and encourage them to mark their success ahead. \n" +
                    "Thank you all for your kind support\n",

            "I am pleased to learn that the Anand Engineering College Technical Campus is organizing its Annual-Techno-Cultural Fest \"Cerebrum 2K20\" with the theme - \"A BIG LEAP\" where the large number of eminent faculty members and students would participate energetically. Anand Engineering College is a well established organization in the field of technical education and research which offers various courses. All students and faculty members are equally participating in making the event a success. I wish the organizers the very best for the successful conduction and organization of the event and publication of Souvenir on this occasion." ,

            "Businesses today has moved out of their comfort zone to explore boundaries hitherto untouched. It is indeed very relevant that Annual Technical and Cultural festival CEREBRUM 2020 is being held at Anand Engineering College, Agra. The purpose of the fest is to provide a forum to committed academicians, management practitioners, eminent researchers, management scholars and students from across the country to deliberate and disseminate not only the academic concepts, theories and models but also to share their experiences in handling various events. I hope that the various activities and events in the festival will help students and participants from various colleges to provide a platform for initiating collaborative effort. I extend my best wishes to all the participants, speakers and hope that festival CEREBRUM 2020, would be a grand success.",

            "It gives me immense pleasure that Anand Engineering College Technical Campus, Keetham,Agra is celebrating CEREBRUM 2K20, two days annual Techno Cultural mega fest from 6 Feb'2020 to 7 Feb'2020 with a great rejuvenating enthusiasm. It is a celebration of innovation and creativity of entire Anandians with joy and cherish for their all-round development and devotional learning.\n" +
                    "I on the behalf of Mechanical Engineering department fraternity congratulate all Anandians on the eve of the occasion of celebrating their zeal & zest with all industriousness and sleepless hardworking. I wish a grand success for converting their holistic effort into reality.\n" +
                    "\n" +
                    "My best wishes to everyone of Anand family.  \n",

            "It's a matter of great pleasure for me to write a message for Cerebrum 2K20, an annual techno-cultural fest of Anand Engineering College, Technical Campus, Agra. This year we are celebrating this fest on 6th and 7th March 2020. The aims and objective of the fest are to provide a platform for students to interact and share their innovative ideas with others. There could hardly be any second opinion on the importance of such technical and cultural events in modern Indian society. I hope that the fest will provide adequate opportunity to all the participants.\n" +
                    "I congratulate the convener, all the coordinators, members of various committees and student volunteers for their hard work and the untiring effort in making the program a real success.\n",

            "Once again Cerebrum 2020 the Techno-Cultural Annual Festival of Anand Engineering College Technical Campus is back with the usual fanfare. This is the time when the Anand Engineering College Campus comes alive with vibrance and exuberance of the youth. Cerebrum 2020 is an opportunity for students to explore and showcase their natural talents and also to immerge from the psychological shells of docility and shyness. Through such annual festivals the students inculcate the sense of responsibility, cooperation, leadership, teamwork and aesthetics all in a very small span of time. \n" +
                    "The colourful and joyous environment during Cerebrum 2020 is always a treat for the eyes when the students display their talents in variety of events like sports, technical events, dance, music, culture, arts rangoli, elocution, fun events etc.       \n" +
                    "I convey my heartiest wishes to all the coordinators and participants – faculty members, staff and students of all colleges on campus.  \n",

            "It gives me immense pleasure to pen a few words as prologue to our college annual event ‘CEREBRUM 2K20` a techno-cultural mega fest exclusively meant for churning out the latent which bears immense potentially of sharpening student`s development. I congratulate all the contributors and organizing committee for bringing out such a beautiful event.\n" +
                    "Empowering of students for their all-round development through education is our college cherished motto. Today education means much more than merely acquiring knowledge. It is acquisition of knowledge and skills, building character and improving employability of our young talent for future leadership. I am sure, students being stars and their painstakingly band gainfully development contribute a lot to AEC Culture, we inherited a strong foundation to march ahead and achieve the within mentioned education objectives for a stronger and brighter India. Measures initiated by Hon. Management, college administration, the willing contribution of the teaching and non-teaching staff and overwhelming response and enthusiastic participation of all students in the college activates in the recent past all vouch for this. When all the constituents come together and work in unison, the expected results are bound to flow.\n" +
                    "I am proud of being the part of such a wonderful event dedicated to the causes of better Anandians, on behalf of MBA department I wish a great success of CEREBRUM 2K20 and congratulate entire students of Anand campus along with a hope that students of the campus will show their talent through their participation in the technical as well as cultural events to ,make the show a grand success.\t\n",

            "Learning is not a process limited to colleges only, nor does if end with conclusion of one’s college career. It is indeed a lifelong process. This college is oriented to the total formation of the student and to adaptations of various methods suiting the dynamics charging world in order to achieve common goals and objectives. It is further characterized by shared vision responsibilities and above all love and faith in almighty in order to achieve these goals.\n" +
                    "            Here is the time of the year to break the monotony of life by showing their various talents in various events. On the occasion of “CEREBRUM-2020.” The time of Joy and Pleasure where we all enjoy the events in Anand Engineering College, Technical Campus, Agra.\n" +
                    "            My heartiest best wishes to all participants and organizes of the colleges. Best of luck.\n" +
                    " \n" +
                    "Thanking you,\n" +
                    "With Best Regards,\n" +
                    "           \n",

            "It provides me immense pleasure to know that the ANANDIAN Family is organizing a Techno-Cultural-Annual Fest CEREBRUM 2k20 on 6thand 7thof March. It’s always a proud moment for a college to put forward the dynamic pieces of creativity, freedom, self-expression and enthusiasm through this Mega-Annual Fest.\n" +
                    "As an academic institution, it is our endeavor to bring out, to sharpen the talent skills among students. Thus to provide a platform where their personalities can bloom to their prime and that we can deliver\n" +
                    "responsible, dedicated and highly professional human resource. This Annual Fest is an amalgamation of the year- long toil of talented souls along with, the blend of unique taste for which each one who has contributed.\n" +
                    "Souvenir is more than just a magazine where the potential, talents, achievements and visions of our college are reflected. This is a proud moment where our teachers and students take pride in their hard work and cherish their fruits of labour and sincerity of the work. I am indeed delighted to welcome the participants in the event and wish them all the success in their mission. And I am sure that this event will be a great success for our college.\n" +
                    "With Best Wishes\n",


            "Anand Engineering college, a place where every year young minds are shaped into responsible and talented human beings. I have also spent some of the most memorable years of my life in this campus where I did my graduation. The atmosphere of AEC is very lively. Studying here is not just about books, copies and lectures. It's about practical experiences. The faculty is very cooperating and friendly. Various events take place from time to time organized by the students, for the students. Cerebrum, the college fest gives everyone a chance to participate in anything they wish. The amazingly beautiful infrastructure is host to all sorts of fun events, technical events and cultural events. Every year a number of students are promoted as graduates. My journey in this college was beautiful. It shaped me as a person about to step in the professional world and made me know myself better!  ",


            "  Four years at Anand Engineering College has paved way for a remarkable journey ahead. The opportunities I received here be it the Media Committee, Compering Committee or Kartavya, it has build the foundation for a more responsible and preeminent individual. I send good luck and best wishes to everybody.\n" +
                    " \n" +
                    "Best Regards\n",

            "Achievements-applauds,opportunities-thoughts, this is what I gained from ANAND ENGINEERING COLLEGE( SGI). Aec gave me a platform that I will always cherish, somedays I won and some days I learned , Right from first year AEC always held my back, my life in AEC Was and will be best experience  I can ever get , endless hostel memories , late night canteen parties with hostel mates , will be holding an eternal moments \n" +
                    "Magnificiant atmosphere along with some supportive faculty members this journey become worth remembering\n" +
                    "AEC let us fall by our own but simultaneously made us climb on the ladders to success...\n",


            "My college life has been a great journey for me. I met with some lovely batchmates, seniors and juniors over the span of four years and became lifelong friends. We share a bond of respect and love for each other. \n" +
                    "We celebrate \"CEREBRUM\" annually. It brings us entertainment, joy and fun. I enjoyed being a part of the Decoration Team for all my graduation years.\n" +
                    "I want to thank all my teachers, seniors and juniors for transforming me into a more mature and better human being and all the sweeping staff for keeping our college neat clean.\n" +
                    "All these life experiences have left an everlasting impact on mind. \n",



            "It’s an honor to be appointed as the organizing secretary of cerebrum 2020, the annual techno-Cultural fest of Anand Engineering College, Technical Campus. Even though we got a late start in our preparations for cerebrum, we both have had a privilege of working with the most dedicated and hard working individuals that our campus has to offer. They gave their 100% and with their combined efforts and high spirits we worked towards making this cerebrum a great success. Being an organizing secretary is a mountain needing diligence and constant hard work to live up to the responsibility of this major task, and we are burning the midnight oil to live up to the expectations of this position.\n" +
                    "\n" +
                    "The aim of the Organizing team this year is to make the cerebrum the biggest it can possibly be and we have put the pedal to the medal. Everyone associated with it has given their level best to make this a benevolent spectacular. I thank each and everyone who are working their fingers to the bone to make cerebrum 2020 an event transcending greatness.\n" +
                    "I extend my heartfelt wishes to each and every student of AECTC and request them to participate in all events that they possibly can. To soak in the fun and excitement that is Cerebrum 2020! Lets enjoy Cerebrum 2020 to the max like there is no tomorrow.\n" +
                    "Thank you. \n",


            "With great pleasure,on behalf of the Souvenir Committee, I present this year’s Souvenir, on the occasion of annual techno-cultural fest ‘Cerebrum-2020’, of Anand Engineering College Technical Campus (AECTC).\n" +
                    "The ‘Cerebrum’ is a national level annual techno-cultural fest of Anand Engineering College, which provides a forum to the students to exhibit their talents in different areas so that their ideas should be conceived, nurtured and given a physical shape. Keeping this in mind the 20th edition of souvenir is being released. The souvenir is like a mirror showing the images of animated testimony of memories, thoughts and creativity of every member associated with it.\n" +
                    "While giving it shape the souvenir committee made every possible effort of excellence and endeavors to feel readers a new era of writing.\n" +
                    "The root thought which made it possible is: “the real voyage of discovery consists not in mapping a new landscape but in having new eyes”. This year we tried to disentangle the souvenir from a mere collection of abridged abstracts to prismatic view. The new avatar of souvenir has new features and flavors.\n" +
                    "This year, the theme of ‘Cerebrum 2020’ is ‘A Big Leap’ to give a message to every participant to break all boundaries and limitations which might come in the path of innovative thinking and creative mind-set.Students are required to take a big leap to attain ultimate success in their personal as well as professional life. \n" +
                    "Souvenir depicts this messagethroughout from the cover page to the last page in many ways. \n" +
                    "Wishing all the contributors a bright and promising career ahead and readers a pleasant-cum-informative reading in the pages. \n",


            "“Take care to get what you like or you’ll be forced to like what you get.”\n" +
                    "                                                                                                  -  George Bernard Shaw \n" +
                    "\n" +
                    "It has been observed that most students struggle to become successful and make a mark for themselves in the long run. The sole reason is their goals are fuzzy and dreams are not clear. In order to achieve success one must strive to materialise one’s dreams.  The day one decides to follow the dreams his goals would never defy that person. But in order that the dreams are realised one must put in the real hard work. As Carl Lewis, the famous athlete had once said, “I gave my life-time to run nine seconds!”  That is the magic of hard work. The work of an institution is to kindle the light of knowledge and churn out the cream hidden in the students. The institutions like Anand Engineering College strive to bring out the best amongst the students and hone their skills and talents. \n" +
                    "Apart from following the curriculum the college provides ample opportunities for the students to showcase their skills – be it science projects, dance, music, painting, rangoli, sports, elocution, drama, etc. Cerebrum-2020 is one such opportunity students eagerly wait for throughout the year. The fun, joy and the razzmatazz of the two-day events are mesmerising and captivating, and the energy in the students is worth watching. Their creativity is at the zenith. \n" +
                    "\n" +
                    "As the Editor I was given the opportunity and responsibility to select and edit write-ups and articles. While going through the task of editing I had the opportunity to witness the knowledge and brilliant ideas which some of the contributors have penned down. The task of \n" +
                    "an editor is to be a judge, as well as to do justice to the works of the budding writers. I am sure the readers would gain knowledge and find some of the write-ups interesting and thought provoking. \n" +
                    "The theme of Cerebrum-2020 is “A Big Leap” which coincides with the giants leaps our nation is taking towards becoming a world power.  \n" +
                    "I convey my best regards to the Organising Committee, the Director, the Convenors and all the Committee Members and students who have given shape to this Two-day grandeur. Please accept my Congratulations from the core of my heart\n"







    };
    private final int[] messageUserImage = {R.drawable.prof_prem_kumar_kalra,
            R.drawable.prof_arun_kumar_yadav,
            R.drawable.pkgupta,
            R.drawable.ykgupta,
            R.drawable.prof_v_k_sharma,
            R.drawable.shailendrasingh,
            R.drawable.himanshu_vijay,
            R.drawable.aatrey_pandey,
            R.drawable.mr_mukul_singh,
            R.drawable.kjkohli,
            R.drawable.dr_amit_sharma,
            R.drawable.atulnarang,
            R.drawable.anoop_kumar_sengar,
            R.drawable.vinay_singh,
            R.drawable.rpsinha,
            R.drawable.rkjain,
            R.drawable.jayvardhane,
            R.drawable.ravi_kant_pathak,
            R.drawable.dharam_singh,
            R.drawable.manish_gupta,
            R.drawable.tumul_saxena,
            R.drawable.sushmita_kumari,
            R.drawable.sudeep_pradhan,
            R.drawable.sameer_pippal,
            R.drawable.organizing_team,
            R.drawable.sanjeevsir,
            R.drawable.sanjay_kulshrestha


    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        ListView mListView = findViewById(R.id.mMessageListView);

        MessageAdapter messageAdapter = new MessageAdapter(getApplicationContext(), messageName, messageUserImage, messagePost, messageHeading);
        mListView.setAdapter(messageAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), MessageDetailActivity.class);
                intent.putExtra("messageName", messageName[position]);
                intent.putExtra("messagePost", messagePost[position]);
                intent.putExtra("messageHeading", messageHeading[position]);
                intent.putExtra("messageUserImage", messageUserImage[position]);
                intent.putExtra("messageDetail", messageDetail[position]);
                startActivity(intent);
            }
        });
    }
}
