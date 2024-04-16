package com.example.newproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageInput = findViewById<EditText>(R.id.ageInput)
        val searchButton = findViewById<Button>(R.id.searchButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val text1 = findViewById<TextView>(R.id.textView2)
        val text2 = findViewById<TextView>(R.id.textView5)

        // Set OnClickListener for the search button
        searchButton.setOnClickListener {
            // Get the entered age as text and convert it to an integer
            val enteredAge = ageInput.text.toString().toIntOrNull()

            // Check if enteredAge matches any of the predefined ages
            if (enteredAge != null) {
                when (enteredAge) {
                    95 -> {
                        text1.text = "Nelson Mandela"
                        text2.text =
                            "You are 95 years old, the same age as Nelson Mandela. He was a leader of the anti-apartheid movement in South Africa."
                    }

                    36 -> {
                        text1.text = "Martin Luther King Jr."
                        text2.text =
                            "You are 36 years old, the same age as Martin Luther King Jr. He was a Baptist minister and leader in the American civil rights movement, known for his role in advancing civil rights using nonviolent civil disobedience."
                    }

                    37 -> {
                        text1.text = "John F. Kennedy"
                        text2.text =
                            "You are 37 years old, the same age as John F. Kennedy. He was an American politician who served as the 35th president of the United States from January 1961 until his assassination in November 1963."
                    }

                    38 -> {
                        text1.text = "Elvis Presley"
                        text2.text =
                            "You are 38 years old, the same age as Elvis Presley. He was an American singer, musician, and actor, often referred to as the 'King of Rock and Roll'."
                    }

                    39 -> {
                        text1.text = "Bruce Lee"
                        text2.text =
                            "You are 39 years old, the same age as Bruce Lee. He was a martial artist, actor, director, and philosopher, best known for his martial arts films."
                    }

                    40 -> {
                        text1.text = "Jim Morrison"
                        text2.text =
                            "You are 40 years old, the same age as Jim Morrison. He was an American singer, songwriter, and poet, best remembered as the lead vocalist of the rock band The Doors."

                    }

                    76 -> {
                        text1.text = "Albert Einstein"
                        text2.text =
                            "You are 76 years old, the same age as Albert Einstein. He was a theoretical physicist known for the theory of relativity."
                    }

                    56 -> {
                        text1.text = "Steve Jobs"
                        text2.text =
                            "You are 56 years old, the same age as Steve Jobs. He was the Co-founder of Apple Inc. and pioneer of personal computers."
                    }

                    78 -> {
                        text1.text = "Mahatma Gandhi"
                        text2.text =
                            "You are 78 years old, the same age as Mahatma Gandhi. He was a leader of the Indian independence movement against British rule."
                    }

                    87 -> {
                        text1.text = "Mother Teresa"
                        text2.text =
                            "You are 87 years old, the same age as Mother Teresa. She was a Roman Catholic nun and missionary who dedicated her life to helping the poor and sick."
                    }

                    65 -> {
                        text1.text = "Walt Disney"
                        text2.text =
                            "You are 65 years old, the same age as Walt Disney. He was an entrepreneur, animator, and film producer, and the co-founder of The Walt Disney Company."
                    }

                    20 -> {
                        text1.text = "Anne Frank"
                        text2.text =
                            "You are 20 years old, the same age as Anne Frank. She was a Jewish girl and diarist who gained fame posthumously after her diary, 'The Diary of a Young Girl', was published."
                    }

                    21 -> {
                        text1.text = "Pele"
                        text2.text =
                            "You are 21 years old, the same age as Pele. He is a Brazilian retired professional footballer who is widely regarded as one of the greatest players of all time."
                    }

                    22 -> {
                        text1.text = "Bill Gates"
                        text2.text =
                            "You are 22 years old, the same age as Bill Gates. He is an American business magnate, software developer, and philanthropist, best known as the co-founder of Microsoft Corporation."
                    }

                    23 -> {
                        text1.text = "Serena Williams"
                        text2.text =
                            "You are 23 years old, the same age as Serena Williams. She is an American professional tennis player and former world No. 1, widely regarded as one of the greatest tennis players of all time."
                    }

                    24 -> {
                        text1.text = "Malala Yousafzai"
                        text2.text =
                            "You are 24 years old, the same age as Malala Yousafzai. She is a Pakistani activist for female education and the youngest Nobel Prize laureate."
                    }

                    25 -> {
                        text1.text = "Usain Bolt"
                        text2.text =
                            "You are 25 years old, the same age as Usain Bolt. He is a retired Jamaican sprinter, widely considered the greatest sprinter of all time."
                    }

                    26 -> {
                        text1.text = "Oprah Winfrey"
                        text2.text =
                            "You are 26 years old, the same age as Oprah Winfrey. She is an American talk show host, television producer, actress, author, and philanthropist, best known for her talk show 'The Oprah Winfrey Show'."
                    }

                    27 -> {
                        text1.text = "Elon Musk"
                        text2.text =
                            "You are 27 years old, the same age as Elon Musk. He is a business magnate, industrial designer, and engineer. He is the founder, CEO, CTO, and chief designer of SpaceX; early investor, CEO, and product architect of Tesla, Inc.; founder of The Boring Company; co-founder of Neuralink; and co-founder and initial co-chairman of OpenAI."
                    }

                    41 -> {
                        text1.text = "Che Guevara"
                        text2.text =
                            "You are 41 years old, the same age as Che Guevara. He was an Argentine Marxist revolutionary, physician, author, guerrilla leader, diplomat, and military theorist."
                    }

                    42 -> {
                        text1.text = "Bob Marley"
                        text2.text =
                            "You are 42 years old, the same age as Bob Marley. He was a Jamaican singer, songwriter, and musician, considered one of the pioneers of reggae music."
                    }

                    43 -> {
                        text1.text = "John Lennon"
                        text2.text =
                            "You are 43 years old, the same age as John Lennon. He was an English singer, songwriter, and peace activist, best known as the co-founder of the Beatles."
                    }

                    44 -> {
                        text1.text = "Jimi Hendrix"
                        text2.text =
                            "You are 44 years old, the same age as Jimi Hendrix. He was an American rock guitarist, singer, and songwriter, widely regarded as one of the most influential electric guitarists in the history of popular music."
                    }

                    45 -> {
                        text1.text = "Freddie Mercury"
                        text2.text =
                            "You are 45 years old, the same age as Freddie Mercury. He was a British singer, songwriter, and record producer, best known as the lead vocalist of the rock band Queen."
                    }

                    28 -> {
                        text1.text = "Mark Zuckerberg"
                        text2.text =
                            "You are 28 years old, the same age as Mark Zuckerberg. He is an American media magnate, internet entrepreneur, and philanthropist. He is known for co-founding Facebook, Inc. and serves as its chairman, chief executive officer, and controlling shareholder."
                    }

                    29 -> {
                        text1.text = "Serena Williams"
                        text2.text =
                            "You are 29 years old, the same age as Serena Williams. She is an American professional tennis player and former world No. 1, widely regarded as one of the greatest tennis players of all time."
                    }

                    30 -> {
                        text1.text = "Frida Kahlo"
                        text2.text =
                            "You are 30 years old, the same age as Frida Kahlo. She was a Mexican painter known for her self-portraits and works inspired by Mexican culture."
                    }

                    31 -> {
                        text1.text = "Amelia Earhart"
                        text2.text =
                            "You are 31 years old, the same age as Amelia Earhart. She was an American aviation pioneer and the first female aviator to fly solo across the Atlantic Ocean."
                    }

                    32 -> {
                        text1.text = "Bruce Lee"
                        text2.text =
                            "You are 32 years old, the same age as Bruce Lee. He was a martial artist, actor, director, and philosopher, best known for his martial arts films."
                    }

                    33 -> {
                        text1.text = "Audrey Hepburn"
                        text2.text =
                            "You are 33 years old, the same age as Audrey Hepburn. She was a British actress and humanitarian, recognized as a film and fashion icon."
                    }

                    34 -> {
                        text1.text = "Marilyn Monroe"
                        text2.text =
                            "You are 34 years old, the same age as Marilyn Monroe. She was an American actress, model, and singer, recognized as one of the most popular women of the 1950s."
                    }

                    35 -> {
                        text1.text = "Princess Diana"
                        text2.text =
                            "You are 35 years old, the same age as Princess Diana. She was a member of the British royal family and the first wife of Charles, Prince of Wales."
                    }

                    51 -> {
                        text1.text = "Marilyn Monroe"
                        text2.text =
                            "You are 51 years old, the same age as Marilyn Monroe. She was an American actress, model, and singer, recognized as one of the most popular women of the 1950s."
                    }

                    52 -> {
                        text1.text = "Stephen Hawking"
                        text2.text =
                            "You are 52 years old, the same age as Stephen Hawking. He was a theoretical physicist known for his work in cosmology, black holes, and quantum gravity."
                    }

                    53 -> {
                        text1.text = "Malcolm X"
                        text2.text =
                            "You are 53 years old, the same age as Malcolm X. He was an African American Muslim minister and human rights activist who was a prominent figure during the civil rights movement."
                    }

                    54 -> {
                        text1.text = "Pablo Picasso"
                        text2.text =
                            "You are 54 years old, the same age as Pablo Picasso. He was a Spanish painter, sculptor, printmaker, and one of the most influential artists of the 20th century."
                    }

                    55 -> {
                        text1.text = "Mother Teresa"
                        text2.text =
                            "You are 55 years old, the same age as Mother Teresa. She was a Roman Catholic nun and missionary who dedicated her life to helping the poor and sick."
                    }

                    57 -> {
                        text1.text = "John Lennon"
                        text2.text =
                            "You are 57 years old, the same age as John Lennon. He was an English singer, songwriter, and peace activist, best known as the co-founder of the Beatles."
                    }

                    58 -> {
                        text1.text = "Mao Zedong"
                        text2.text =
                            "You are 58 years old, the same age as Mao Zedong. He was a Chinese communist revolutionary and founding father of the People's Republic of China."
                    }

                    59 -> {
                        text1.text = "Frank Sinatra"
                        text2.text =
                            "You are 59 years old, the same age as Frank Sinatra. He was an American singer, actor, and producer, regarded as one of the greatest singers of the 20th century."
                    }

                    60 -> {
                        text1.text = "Princess Diana"
                        text2.text =
                            "You are 60 years old, the same age as Princess Diana. She was a member of the British royal family and the first wife of Charles, Prince of Wales."
                    }

                    61 -> {
                        text1.text = "Charles Darwin"
                        text2.text =
                            "You are 61 years old, the same age as Charles Darwin. He was an English naturalist, geologist, and biologist, best known for his contributions to the science of evolution."
                    }

                    62 -> {
                        text1.text = "Madonna"
                        text2.text =
                            "You are 62 years old, the same age as Madonna. She is an American singer, songwriter, actress, and businesswoman, often referred to as the 'Queen of Pop'."
                    }

                    63 -> {
                        text1.text = "Audrey Hepburn"
                        text2.text =
                            "You are 63 years old, the same age as Audrey Hepburn. She was a British actress and humanitarian, recognized as a film and fashion icon."
                    }

                    64 -> {
                        text1.text = "Michael Jackson"
                        text2.text =
                            "You are 64 years old, the same age as Michael Jackson, the King of Pop and one of the best-selling music artists."
                    }

                    66 -> {
                        text1.text = "Marie Curie"
                        text2.text =
                            "You are 66 years old, the same age as Marie Curie. She was a physicist and chemist known for her research on radioactivity."
                    }

                    67 -> {
                        text1.text = "Leonardo da Vinci"
                        text2.text =
                            "You are 67 years old, the same age as Leonardo da Vinci. He was an Italian polymath of the Renaissance whose areas of interest included invention, painting, sculpting, architecture, science, music, mathematics, engineering, literature, anatomy, geology, astronomy, botany, writing, history, and cartography."
                    }

                    68 -> {
                        text1.text = "Napoleon Bonaparte"
                        text2.text =
                            "You are 68 years old, the same age as Napoleon Bonaparte. He was a French military and political leader who rose to prominence during the French Revolution and its associated wars."
                    }

                    69 -> {
                        text1.text = "Vincent van Gogh"
                        text2.text =
                            "You are 69 years old, the same age as Vincent van Gogh. He was a Dutch post-impressionist painter who is among the most famous and influential figures in the history of Western art."
                    }

                    70 -> {
                        text1.text = "Albert Einstein"
                        text2.text =
                            "You are 70 years old, the same age as Albert Einstein. He was a theoretical physicist known for the theory of relativity."
                    }

                    71 -> {
                        text1.text = "Abraham Lincoln"
                        text2.text =
                            "You are 71 years old, the same age as Abraham Lincoln. He was an American statesman and lawyer who served as the 16th president of the United States from 1861 until his assassination in 1865."
                    }

                    72 -> {
                        text1.text = "Winston Churchill"
                        text2.text =
                            "You are 72 years old, the same age as Winston Churchill. He was a British statesman, army officer, and writer, who served as Prime Minister of the United Kingdom from 1940 to 1945 and again from 1951 to 1955."
                    }

                    73 -> {
                        text1.text = "George Washington"
                        text2.text =
                            "You are 73 years old, the same age as George Washington. He was an American political leader, military general, statesman, and founding father who served as the first president of the United States from 1789 to 1797."
                    }

                    74 -> {
                        text1.text = "Socrates"
                        text2.text =
                            "You are 74 years old, the same age as Socrates. He was a classical Greek philosopher credited as one of the founders of Western philosophy."
                    }

                    75 -> {
                        text1.text = "Queen Victoria"
                        text2.text =
                            "You are 75 years old, the same age as Queen Victoria. She was Queen of the United Kingdom of Great Britain and Ireland from 1837 until her death in 1901."
                    }

                    77 -> {
                        text1.text = "Christopher Columbus"
                        text2.text =
                            "You are 77 years old, the same age as Christopher Columbus. He was an Italian explorer and navigator who completed four voyages across the Atlantic Ocean, opening the way for the widespread European exploration and colonization of the Americas."
                    }

                    79 -> {
                        text1.text = "Nelson Mandela"
                        text2.text =
                            "You are 79 years old, the same age as Nelson Mandela. He was a leader of the anti-apartheid movement in South Africa."
                    }

                    80 -> {
                        text1.text = "George Orwell"
                        text2.text =
                            "You are 80 years old, the same age as George Orwell. He was an English novelist, essayist, journalist, and critic, best known for his dystopian novel 'Nineteen Eighty-Four' and the allegorical novella 'Animal Farm'."
                    }

                    81 -> {
                        text1.text = "William Shakespeare"
                        text2.text =
                            "You are 81 years old, the same age as William Shakespeare. He was an English playwright, poet, and actor, widely regarded as the greatest writer in the English language and the world's greatest dramatist."
                    }

                    82 -> {
                        text1.text = "Queen Elizabeth II"
                        text2.text =
                            "You are 82 years old, the same age as Queen Elizabeth II. She is the longest-reigning current monarch and the longest-serving current head of state."
                    }

                    83 -> {
                        text1.text = "Charles Darwin"
                        text2.text =
                            "You are 83 years old, the same age as Charles Darwin. He was an English naturalist, geologist, and biologist, best known for his contributions to the science of evolution."
                    }

                    84 -> {
                        text1.text = "Vincent van Gogh"
                        text2.text =
                            "You are 84 years old, the same age as Vincent van Gogh. He was a Dutch post-impressionist painter who is among the most famous and influential figures in the history of Western art."
                    }

                    85 -> {
                        text1.text = "Mother Teresa"
                        text2.text =
                            "You are 85 years old, the same age as Mother Teresa. She was a Roman Catholic nun and missionary who dedicated her life to helping the poor and sick."
                    }

                    86 -> {
                        text1.text = "Walt Disney"
                        text2.text =
                            "You are 86 years old, the same age as Walt Disney. He was an entrepreneur, animator, and film producer, and the co-founder of The Walt Disney Company."
                    }

                    88 -> {
                        text1.text = "Queen Elizabeth The Queen Mother"
                        text2.text =
                            "You are 88 years old, the same age as Queen Elizabeth The Queen Mother. She was the queen consort of King George VI and mother of Queen Elizabeth II and Princess Margaret, Countess of Snowdon."
                    }

                    89 -> {
                        text1.text = "Leonardo da Vinci"
                        text2.text =
                            "You are 89 years old, the same age as Leonardo da Vinci. He was an Italian polymath of the Renaissance whose areas of interest included invention, painting, sculpting, architecture, science, music, mathematics, engineering, literature, anatomy, geology, astronomy, botany, writing, history, and cartography."
                    }

                    90 -> {
                        text1.text = "Pablo Picasso"
                        text2.text =
                            "You are 90 years old, the same age as Pablo Picasso. He was a Spanish painter, sculptor, printmaker, and one of the most influential artists of the 20th century."
                    }

                    91 -> {
                        text1.text = "Albert Einstein"
                        text2.text =
                            "You are 91 years old, the same age as Albert Einstein. He was a theoretical physicist known for the theory of relativity."
                    }

                    92 -> {
                        text1.text = "Queen Elizabeth The Queen Mother"
                        text2.text =
                            "You are 92 years old, the same age as Queen Elizabeth The Queen Mother. She was the queen consort of King George VI and mother of Queen Elizabeth II and Princess Margaret, Countess of Snowdon."
                    }

                    93 -> {
                        text1.text = "George Bernard Shaw"
                        text2.text =
                            "You are 93 years old, the same age as George Bernard Shaw. He was an Irish playwright, critic, polemicist, and political activist, best known for his plays, including 'Pygmalion'."
                    }

                    94 -> {
                        text1.text = "Queen Elizabeth The Queen Mother"
                        text2.text =
                            "You are 94 years old, the same age as Queen Elizabeth The Queen Mother. She was the queen consort of King George VI and mother of Queen Elizabeth II and Princess Margaret, Countess of Snowdon."
                    }

                    96 -> {
                        text1.text = "Queen Elizabeth II"
                        text2.text =
                            "You are 96 years old, the same age as Queen Elizabeth II. She is the longest-reigning current monarch and the longest-serving current head of state."
                    }

                    97 -> {
                        text1.text = "Harper Lee"
                        text2.text =
                            "You are 97 years old, the same age as Harper Lee. She was an American novelist widely known for her novel 'To Kill a Mockingbird', which won the Pulitzer Prize for Fiction in 1961."
                    }

                    98 -> {
                        text1.text = "Nelson Mandela"
                        text2.text =
                            "You are 98 years old, the same age as Nelson Mandela. He was a leader of the anti-apartheid movement in South Africa."
                    }

                    99 -> {
                        text1.text = "Betty White"
                        text2.text =
                            "You are 99 years old, the same age as Betty White. She was an American actress and comedian, known for her roles in television sitcoms such as 'The Mary Tyler Moore Show' and 'The Golden Girls'."
                    }

                    100 -> {
                        text1.text = "Queen Elizabeth The Queen Mother"
                        text2.text =
                            "You are 100 years old, the same age as Queen Elizabeth The Queen Mother. She was the queen consort of King George VI and mother of Queen Elizabeth II and Princess Margaret, Countess of Snowdon."
                    }
                    // Add more cases for other ages as needed
                    else -> {
                        // If age does not match any predefined age, display the out of range message
                        text1.text = "OOPS"
                        text2.text = "The age is out of range."
                    }
                }
            } else {
                // If enteredAge is null, display an error message
                text1.text = "OOPS"
                text2.text = "Invalid input. Please enter a valid age."
            }
        }

        // Set OnClickListener for the clear button to clear the text views and age input
        clearButton.setOnClickListener {
            ageInput.text.clear()
            text1.text = ""
            text2.text = ""
        }
    }
}