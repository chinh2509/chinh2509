<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateWorkTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    
    
    public function up()
    {
        Schema::create('work', function (Blueprint $table) {
            $table->id();
            $table->text('salary')->nullable();
            $table->text('title');
            $table->text('address')->nullable();
            $table->text('form');
            $table->text('career');
            $table->text('description');
            $table->text('right-vc');


        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('work');
    }
}
